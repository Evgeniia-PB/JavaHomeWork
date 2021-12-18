package com.pb.Krivolapova.HW11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String phoneBookJson;
        int index;

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());

        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);


        List<PhoneBook> phoneBookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Телефонная книга");
            System.out.println("Выбирите действие со списка:");
            System.out.println("1. Вывести на экран информацию с телефонной книги");
            System.out.println("2. Добавление записи в телефонную книгу");
            System.out.println("3. Удаление записи из телефонной книги");
            System.out.println("4. Найти запись в телефонной книге");
            System.out.println("5. Отсортировать записи в телефонной книге по ФИО");
            System.out.println("6. Отсортировать записи в телефонной книге по адресу");
            System.out.println("7. Отредактировать запись в телефонной книге");
            System.out.println("8. Записать в файл записи с телефонной книги");
            System.out.println("9. Загрузить из файла все записи");
            System.out.println("0. Выйти из телефонной книги");

            String option = scan.next();

            switch (option) {
                case "1":
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    System.out.println(phoneBookJson);
                    break;

                case "2":
                    phoneBookList.add(addElement(scan));
                    System.out.println("Запись в телефонную книгу успешно добавлена");
                    break;

                case "3":
                    System.out.println("Введите индекс записи с телефонной книги для удаления: ");
                    index = getIndex(scan);
                    phoneBookList.remove(index);
                    System.out.println("Запись под индексом " + index + " с телефонной книги успешно удалена.");
                    break;

                case "4":
                    System.out.println("Введите индекс записи для поиска в телефонной книге: ");
                    index = getIndex(scan);
                    phoneBookJson = mapper.writeValueAsString(phoneBookList.get(index));
                    System.out.println(phoneBookJson);
                    break;

                case "5":
                    TreeSet<PhoneBook> fioCompar = new TreeSet<>(new Comparator<PhoneBook>() {
                        @Override
                        public int compare(PhoneBook a, PhoneBook b) {
                            return a.getFio().compareTo(b.getFio());
                        }
                    });
                    fioCompar.addAll(phoneBookList);

                    phoneBookJson = mapper.writeValueAsString(fioCompar);
                    System.out.println(phoneBookJson);
                    break;

                case "6":
                    TreeSet<PhoneBook> addressCompar = new TreeSet<>(new Comparator<PhoneBook>() {
                        @Override
                        public int compare(PhoneBook a, PhoneBook b) {
                            return a.getAddress().compareTo(b.getAddress());
                        }
                    });
                    addressCompar.addAll(phoneBookList);

                    phoneBookJson = mapper.writeValueAsString(addressCompar);
                    System.out.println(phoneBookJson);
                    break;


                case "7":
                    edit(scan, phoneBookList);
                    break;

                case "8":
                    FileWriter file = new FileWriter("phonebook.json");
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    file.append(phoneBookJson);
                    file.flush();
                    file.close();

                    System.out.println("Запись в файл успешно завершена.");
                    break;

                case "9":
                    phoneBookList = new ArrayList<>(Arrays.asList(mapper.readValue(Paths.get("phonebook.json").toFile(), PhoneBook[].class)));
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    System.out.println(phoneBookJson);
                    break;

                case "0":
                    System.out.println("Завершение работы справочника");
                    return;
                default:
                    System.out.println("Ошибка. Выполнить невозможно. Попробуйте еще раз");
            }
        }

    }

    private static PhoneBook addElement(Scanner scan) {
        String str = scan.nextLine();
        System.out.println("Введите ФИО: ");
        String fio = scan.nextLine();

        System.out.println("Введите дату рождения в формате dd/MM/yyyy: ");
        LocalDate dateOfBirth = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Введите телефон: ");
        String phone = scan.nextLine();

        System.out.println("Введите адрес: ");
        String address = scan.nextLine();

        PhoneBook phoneBook = new PhoneBook(fio, dateOfBirth, phone, address);
        return phoneBook;
    }

    private static int getIndex(Scanner scan) {
        return scan.nextInt();
    }

    private static String scanner(Scanner scan) {
        String str = scan.nextLine();
        return scan.nextLine();
    }

    private static void edit(Scanner scan, List<PhoneBook> phoneBookList) {

        System.out.println("Введите индекс записи для редактирования в телефонной книге: ");
        int index = getIndex(scan);
        PhoneBook phoneBook = phoneBookList.get(index);

        System.out.println();
        System.out.println("1. Редактировать ФИО");
        System.out.println("2. Редактировать дату рождения");
        System.out.println("3. Редактировать телефон");
        System.out.println("4. Редактировать адрес");
        System.out.println("0. Вернуться в главное меню");

        String option = scan.next();

        switch (option) {
            case "1":
                System.out.println("Введите новое ФИО:");
                phoneBook.setFio(scanner(scan));
                break;
            case "2":
                System.out.println("Введите новую дату в формате dd/MM/yyyy :");
                phoneBook.setDateOfBirth(LocalDate.parse(scanner(scan), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                break;
            case "3":
                System.out.println("Введите номер телефона:");
                phoneBook.setPhone(scanner(scan));
                break;
            case "4":
                System.out.println("Введите новый адрес:");
                phoneBook.setAddress(scanner(scan));
                break;
            case "0":
                break;
            default:
                System.out.println("Ошибка ввода выбора действия.");
        }
        phoneBookList.set(index, phoneBook);
        if (!option.equals("0")) {
            System.out.println("Данные успешно отредактированы");
        }
    }
}

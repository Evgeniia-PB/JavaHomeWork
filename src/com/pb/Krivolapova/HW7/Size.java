package com.pb.Krivolapova.HW7;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    public  String getDescription() {
        return "Взрослый размер";
        }

    private String name;
    private int EuroSize;

    Size(int euroSize) {
        EuroSize = euroSize;
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

}

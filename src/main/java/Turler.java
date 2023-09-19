public enum Turler {
    ROMAN(1,"Roman"),
    HIKAYE(2,"Hikaye"),
    BILISIM(3,"Bilişim"),
    EDEBIYAT(4,"Edebiyat"),
    DINI(5,"Dini");
    private final int typeCode;
    private final String typeName;

    Turler(int typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }
}

class Aksi {
    public static void main(String[] args) {
        // Membuat 3 objek dari Class Data
        Data data1 = new Data("Khalish", 21, "Martapura", "Membaca Buku", "Wirausaha");
        Data data2 = new Data("Yono", 20, "Banjarbaru", "Menulis", "Guru");
        Data data3 = new Data("Caca", 18, "Banjarbaru", "Menari", "Seniman");

        // Mengisi atribut pada objek data1
        data1.setNama("Muhammad Noor Khalish");
        data1.setUsia(21);
        data1.setAlamat("Martapura");
        data1.setHobi("Membaca buku dan bermain game");
        data1.setCitaCita("Wirausaha");

        // Menampilkan informasi data
        System.out.println("Data 1:");
        data1.tampilData();

        System.out.println("\nData 2:");
        data2.tampilData();

        System.out.println("\nData 3:");
        data3.tampilData();
    }
}

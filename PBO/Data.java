class Data {
    // Deklarasi atribut
    private String nama;
    private int usia;
    private String alamat;
    private String hobi;
    private String citaCita;

    // Constructor untuk menginisialisasi atribut
    public Data(String nama, int usia, String alamat, String hobi, String citaCita) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.hobi = hobi;
        this.citaCita = citaCita;
    }
    // Getter untuk mengakses atribut nama
    public String getNama() {
        return nama;
    }
    // Setter untuk mengubah nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    // Getter untuk mengakses atribut usia
    public int getUsia() {
        return usia;
    }
    // Setter untuk mengubah nilai atribut usia
    public void setUsia(int usia) {
        this.usia = usia;
    }
    // Getter untuk mengakses atribut alamat
    public String getAlamat() {
        return alamat;
    }
    // Setter untuk mengubah nilai atribut alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // Getter untuk mengakses atribut hobi
    public String getHobi() {
        return hobi;
    }
    // Setter untuk mengubah nilai atribut hobi
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    // Getter untuk mengakses atribut citaCita
    public String getCitaCita() {
        return citaCita;
    }
    // Setter untuk mengubah nilai atribut citaCita
    public void setCitaCita(String citaCita) {
        this.citaCita = citaCita;
    }
    // Method untuk menampilkan semua informasi data
    public void tampilData() {
        System.out.println("Nama: " + getNama());
        System.out.println("Usia: " + getUsia());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Hobi: " + getHobi());
        System.out.println("Cita-cita: " + getCitaCita());
    }
}

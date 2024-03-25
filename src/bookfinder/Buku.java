/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookfinder;

/**
 *
 * @author waliy
 */
class Buku {
    private String isbn;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String rak;
    private int stok;

    public Buku(String isbn, String judul, String pengarang, String penerbit, String rak, int stok) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.rak = rak;
        this.stok = stok;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getRak() {
        return rak;
    }

    public int getStok() {
        return stok;
    }
}

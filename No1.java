package com;

import java.util.ArrayList;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> arrBuku = new ArrayList();

        int a = 0;
        while(a!=6){
            System.out.println("Pilih data");
            System.out.println("1. Input Data Buku");
            System.out.println("2. Ubah Data");
            System.out.println("3. Menampilkan Semua Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Mengahapus Data");
            System.out.println("6. Selesai");

            a = input.nextInt();

            switch (a){
                case 1 :
                    System.out.println("no ISBN (5 Digit)");
                    String isbn = input.next();
                    System.out.println("Judul Buku");
                    String judulBuku = input.next();
                    System.out.println("Pengarang");
                    String pengarang = input.next();
                    System.out.println("Tahun Terbit");
                    String tahunTerbit = input.next();
                    System.out.println("Harga");
                    String harga = input.next();
                    System.out.println("Rating");
                    float rating = input.nextFloat();

                    Buku hasil = new Buku(isbn, judulBuku, pengarang, tahunTerbit, harga, rating);
                    arrBuku.add(hasil);
                    System.out.println("Data buku berhasil ditambahkan");
                    break;

                case 2 :
                    System.out.println("Masukkan no ISBN (5 Digit)");
                    String search = input.next();
                    for (Buku newDataBuku : arrBuku){
                        if (newDataBuku.getIsbn().equals(search)){
                            System.out.println("no ISBN " + newDataBuku.getIsbn());
                            System.out.println("Masukkan Judul Buku Baru");
                            String newJudulBuku = input.next();
                            newDataBuku.setJudulBuku(newJudulBuku);

                            System.out.println("Masukkan Pengarang");
                            String newPengarang = input.next();
                            newDataBuku.setPengarang(newPengarang);

                            System.out.println("Masukkan Tahun Terbit");
                            String newTahunTerbit = input.next();
                            newDataBuku.setTahunTerbit(newTahunTerbit);

                            System.out.println("Masukkan Harga");
                            String newHarga = input.next();
                            newDataBuku.setHarga(newHarga);

                            System.out.println("Rating");
                            float newRating = input.nextFloat();
                            newDataBuku.setRating(newRating);

                            System.out.println("Data berhasil diubah");

                        } else {
                            System.out.println("Data tidak ditemukan");
                        }
                    }
                    break;

                case 3 :
                    for (int i = 0; i < arrBuku.size(); i++) {
                        System.out.println(arrBuku.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Masukkan no ISBN (5 Digit)");
                    String cari = input.next();

                    for(Buku dataBuku : arrBuku){
                        if (dataBuku.getIsbn().equals(cari)){
                            System.out.println(dataBuku);
                        }
                    }
                    break;

                case 5 :
                    System.out.println("Hapus data Buku");
                    String isbnBuku = input.next();
                    for (int i = 0; i < arrBuku.size(); i++) {
                        if (isbnBuku.equals(arrBuku.get(i).getIsbn())){
                            arrBuku.remove(arrBuku.get(i));
                            System.out.println("Buku telah dihapus");
                        } else {
                            System.out.println("Buku tidak ditemukan");
                        }
                    }
                    break;
                case 6 :
                    System.out.println("selesai");
                    break;

            }
        }
    }
}
import java.util.Scanner;

public class GeometryConverterApp {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.start();
    }
}

class MainMenu {
    private Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new GeometryMenu().start();
                    break;
                case 2:
                    new ConversionMenu().start();
                    break;
                case 3:
                    new SecretMenu().start();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("===Silahkan Pilih Menu===");
        System.out.println(" 1.Bangun Ruang/Datar");
        System.out.println(" 2.Konversi");
        System.out.println(" 3.Secret Menu");
        System.out.println(" 4.Exit");
        System.out.print("Input Untuk Memilih Menu Diatas : ");
    }
}

class GeometryMenu {
    private Scanner scanner;

    public GeometryMenu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayGeometrySubMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateArea();
                    break;
                case 2:
                    calculateVolume();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayGeometrySubMenu() {
        System.out.println("<==Bangun Ruang Datar==>");
        System.out.println("Silahkan Pilih Rumus :");
        System.out.println(" 1.Luas(Meter Kuadrat)");
        System.out.println(" 2.Volume(Liter)");
        System.out.println(" 3.Exit");
        System.out.print("Massukkan Nomor: ");
    }

    private void calculateArea() {
        while (true) {
            System.out.println("Silahkan Pilih Menu : ");
            System.out.println("1).Persegi Panjang");
            System.out.println("2).Persegi");
            System.out.println("3).Segitiga");
            System.out.println("4).Lingkaran");
            System.out.println("5).Exit");
            System.out.print("Silahkan Pilih : ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Rectangle
                    System.out.print("Masukkan Panjang: ");
                    double length = scanner.nextDouble();
                    System.out.print("Masukkan Lebar: ");
                    double width = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.0f m²\n", length * width);
                    break;
                case 2: // Square
                    System.out.print("Masukkan Sisi: ");
                    double side = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.0f m²\n", side * side);
                    break;
                case 3: // Triangle
                    System.out.print("Masukkan Alas: ");
                    double base = scanner.nextDouble();
                    System.out.print("Masukkan Tinggi: ");
                    double height = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.0f m²\n", 0.5 * base * height);
                    break;
                case 4: // Circle
                    System.out.print("Masukkan Radius²: ");
                    double radius = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.0f m²\n", (22.0/7.0) * radius * radius);
                    break;
                case 5:
                    System.out.println("Mencapai Batas Akhir Luas");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void calculateVolume() {
        while (true) {
            System.out.println("Pilihan Menu ");
            System.out.println("1.Balok");
            System.out.println("2.Kubus");
            System.out.println("3.Bola");
            System.out.println("4.Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Balok (Cuboid)
                    System.out.print("Masukkan Panjang: ");
                    double length = scanner.nextDouble();
                    System.out.print("Masukkan Lebar: ");
                    double width = scanner.nextDouble();
                    System.out.print("Masukkan Tinggi: ");
                    double height = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.0f Liter\n", length * width * height);
                    break;
                case 2: // Kubus (Cube)
                    System.out.print("Masukkan Sisi: ");
                    double side = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.0f Liter\n", side * side * side);
                    break;
                case 3: // Bola (Sphere)
                    System.out.print("Masukkan Radius: ");
                    double radius = scanner.nextDouble();
                    System.out.printf("Hasilnya : %.2f Liter\n", (4.0/3.0) * Math.PI * Math.pow(radius, 3));
                    break;
                case 4:
                    System.out.println("Mencapai Batas Akhir Volume");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class ConversionMenu {
    private Scanner scanner;

    public ConversionMenu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayConversionMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    temperatureConversion();
                    break;
                case 2:
                    lengthConversion();
                    break;
                case 3:
                    weightConversion();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayConversionMainMenu() {
        System.out.println("Pilih Menu di bawah ini : ");
        System.out.println(" 1. Derajat");
        System.out.println(" 2. Panjang (meter)");
        System.out.println(" 3. Berat (gram)");
        System.out.println(" 4. Exit");
    }

    private void temperatureConversion() {
        while (true) {
            System.out.println("Pilih soal dibawah ini : ");
            System.out.println(" 1. Celcius");
            System.out.println(" 2. Farenhait");
            System.out.println(" 3. Reamur");
            System.out.println(" 4. Exit");
            System.out.print("masukkan pilihan : ");
            
            int scale = scanner.nextInt();
            switch (scale) {
                case 1: // Celcius
                    celciusConversion();
                    break;
                case 2: // Fahrenheit
                    fahrenheitConversion();
                    break;
                case 3: // Reamur
                    reamurConversion();
                    break;
                case 4:
                    return;
            }
        }
    }

    private void celciusConversion() {
        while (true) {
            System.out.println("Derajat celcius");
            System.out.println("1. celcius ke farenhait");
            System.out.println("2. celcius ke reamur");
            System.out.println("3. exit");
            System.out.print("Masukan nomer yang anda pilih: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukan Nilai Celcius: ");
                    double celcius = scanner.nextDouble();
                    System.out.printf("%.1f°C di ubah ke %.1f °F\n", celcius, (celcius * 9/5) + 32);
                    break;
                case 2:
                    System.out.print("Masukan Nilai Celcius: ");
                    celcius = scanner.nextDouble();
                    System.out.printf("%.1f°C di ubah ke %.1f °R\n", celcius, celcius * 4/5);
                    break;
                case 3:
                    return;
            }
        }
    }

    private void fahrenheitConversion() {
        while (true) {
            System.out.println("Derajat farenhait");
            System.out.println("1. farenhait ke celcius");
            System.out.println("2. farenhait ke reamur");
            System.out.println("3. exit");
            System.out.print("Masukan nomer yang anda pilih: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukan Nilai Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.printf("%.1f°F di ubah ke %.1f °C\n", fahrenheit, (fahrenheit - 32) * 5/9);
                    break;
                case 2:
                    System.out.print("Masukan Nilai Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.printf("%.1f°F di ubah ke %.1f °R\n", fahrenheit, (fahrenheit - 32) * 4/9);
                    break;
                case 3:
                    return;
            }
        }
    }

    private void reamurConversion() {
        // Similar implementation to other temperature conversions can be added
        System.out.println("Reamur conversion not implemented.");
        return;
    }

    private void lengthConversion() {
        while (true) {
            System.out.println("Panjang");
            System.out.println("Silahkan Pilih :");
            System.out.println(" 1. Kilometer");
            System.out.println(" 2. Hektometer");
            System.out.println(" 3. Dekameter");
            System.out.println(" 4. Desimeter");
            System.out.println(" 5. Sentimeter");
            System.out.println(" 6. Milimeter");
            System.out.println(" 7. Exit");
            
            int choice = scanner.nextInt();
            if (choice == 7) break;
            
            System.out.print("Masukkan Panjang (meter): ");
            double meters = scanner.nextDouble();
            
            switch (choice) {
                case 1: // Kilometer
                    System.out.printf("Hasil %.3f Km\n", meters / 1000);
                    break;
                case 2: // Hektometer
                    System.out.printf("Hasil %.1f Hm\n", meters / 100);
                    break;
                case 3: // Dekameter
                    System.out.printf("Hasil %.1f Dam\n", meters / 10);
                    break;
                case 4: // Desimeter
                    System.out.printf("Hasil %.1f Dm\n", meters * 10);
                    break;
                case 5: // Sentimeter
                    System.out.printf("Hasil %.1f Cm\n", meters * 100);
                    break;
                case 6: // Milimeter
                    System.out.printf("Hasil %.1f Mm\n", meters * 1000);
                    break;
            }
        }
    }

    private void weightConversion() {
        while (true) {
            System.out.println("Berat");
            System.out.println("Silahkan Pilih :");
            System.out.println(" 1. KiloGram");
            System.out.println(" 2. HektoGram");
            System.out.println(" 3. DekaGram");
            System.out.println(" 4. DesiGram");
            System.out.println(" 5. SentiGram");
            System.out.println(" 6. MiliGram");
            System.out.println(" 7. Exit");
            
            int choice = scanner.nextInt();
            if (choice == 7) break;
            
            System.out.print("Masukkan Berat (gram): ");
            double grams = scanner.nextDouble();
            
            switch (choice) {
                case 1: // Kilogram
                    System.out.printf("Hasil %.3f Kg\n", grams / 1000);
                    break;
                case 2: // Hektogram
                    System.out.printf("Hasil %.1f Hg\n", grams / 100);
                    break;
                case 3: // Dekagram
                    System.out.printf("Hasil %.1f Dag\n", grams / 10);
                    break;
                case 4: // Desigram
                    System.out.printf("Hasil %.1f Dg\n", grams * 10);
                    break;
                case 5: // Sentigram
                    System.out.printf("Hasil %.1f Cg\n", grams * 100);
                    break;
                case 6: // Miligram
                    System.out.printf("Hasil %.1f Mg\n", grams * 1000);
                    break;
            }
        }
    }
}

class SecretMenu {
    private Scanner scanner;
    private static final String SECRET_CODE = "12345678";

    public SecretMenu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Masukan kode unik: ");
        String input = scanner.next();

        if (!input.equals(SECRET_CODE)) {
            System.out.println("Kode salah!");
            return;
        }

        System.out.println("Selamat Datang VIP!!");

        while (true) {
            displaySecretMenuOptions();

            // Validasi input
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // Clear buffer
                continue;
            }

            switch (choice) {
                case 1:
                    toUppercase();
                    break;
                case 2:
                    toLowercase();
                    break;
                case 3:
                    reverseString();
                    break;
                case 4:
                    System.out.println("Kembali ke menu utama.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    private void displaySecretMenuOptions() {
        System.out.println("=== Secret Menu ===");
        System.out.println("1. Ubah teks ke huruf besar");
        System.out.println("2. Ubah teks ke huruf kecil");
        System.out.println("3. Balik teks");
        System.out.println("4. Kembali");
        System.out.print("Pilih opsi: ");
    }

    private void toUppercase() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan teks: ");
        String input = scanner.nextLine(); // Baca seluruh baris
        System.out.println("Hasil: " + input.toUpperCase());
    }

    private void toLowercase() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan teks: ");
        String input = scanner.nextLine(); // Baca seluruh baris
        System.out.println("Hasil: " + input.toLowerCase());
    }

    private void reverseString() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan teks: ");
        String input = scanner.nextLine(); // Baca seluruh baris
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Hasil: " + reversed);
    }
}

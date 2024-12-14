import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adminName = "Administrator";
        String password = ""; // Harus diisi dengan nilai yang valid
        int pin = 123456789;

        // Login Simulation
        System.out.println("Masukan Nama: ");
        String inputName = scanner.nextLine();
        System.out.println("Masukan Password: ");
        String inputPassword = scanner.nextLine();

        if (!inputName.equals(adminName) || password.length() > 4) {
            System.out.println("Login gagal!");
            return;
        }

        System.out.println("Masukan PIN: ");
        int inputPin = scanner.nextInt();
        if (inputPin != pin) {
            System.out.println("PIN salah!");
            return;
        }

        boolean mainMenu = true;
        while (mainMenu) {
            System.out.println("===Silahkan Pilih Menu===");
            System.out.println("1. Bangun Ruang/Datar");
            System.out.println("2. Konversi");
            System.out.println("3. Secret Menu");
            System.out.println("4. Exit");

            int mainChoice = scanner.nextInt();
            switch (mainChoice) {
                case 1:
                    bangunRuangDatarMenu(scanner);
                    break;
                case 2:
                    konversiMenu(scanner);
                    break;
                case 3:
                    secretMenuWithCode(scanner);
                                        break;
                                    case 4:
                                        mainMenu = false;
                                        System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");
                                }
                            }
                            scanner.close();
                        }
                    
                        private static void secretMenuWithCode(Scanner scanner) {
                            final String uniqueCode = "7"; // Kode unik untuk mengakses menu rahasia
                            System.out.println("Masukkan kode unik 1-10 untuk mengakses Menu Rahasia:");
                            scanner.nextLine(); // Konsumsi newline
                            String inputCode = scanner.nextLine();
                    
                            if (!inputCode.equals(uniqueCode)) {
                                System.out.println("Kode unik salah! Akses ditolak.");
                                return;
                            }
                    
                            System.out.println("Selamat Datang di Menu Rahasia!");
                            boolean secretMenu = true;
                            while (secretMenu) {
                                System.out.println("Silahkan Pilih Menu Rahasia:");
                                System.out.println("1. Uppercase");
                                System.out.println("2. Lowercase");
                                System.out.println("3. Reverse");
                                System.out.println("4. Exit");
                    
                                if (!scanner.hasNextInt()) {
                                    System.out.println("Input tidak valid! Masukkan angka.");
                                    scanner.nextLine(); // Konsumsi input yang salah
                                    continue;
                                }
                    
                        
                                int choice = scanner.nextInt();
                                scanner.nextLine(); // Konsumsi newline
                                switch (choice) {
                                    case 1:
                                        System.out.println("Masukkan teks: ");
                                        String text = scanner.nextLine();
                                        System.out.println("Hasil Uppercase: " + text.toUpperCase());
                                        break;
                                    case 2:
                                        System.out.println("Masukkan teks: ");
                                        text = scanner.nextLine();
                                        System.out.println("Hasil Lowercase: " + text.toLowerCase());
                                        break;
                                    case 3:
                                        System.out.println("Masukkan teks: ");
                                        text = scanner.nextLine();
                                        String reversedWords = reverseWords(text);
                                        System.out.println("Hasil Reverse: " + reversedWords);
                                        break;
                                    case 4:
                                        secretMenu = false;
                                        System.out.println("Keluar dari Menu Rahasia.");
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");
                                }
                            }
                        }
                        
                        private static String reverseWords(String text) {
                            String[] words = text.split(" "); // Pisahkan teks menjadi array kata
                            StringBuilder reversed = new StringBuilder();
                            for (int i = words.length - 1; i >= 0; i--) {
                                reversed.append(words[i]); // Tambahkan kata dari akhir ke awal
                                if (i != 0) {
                                    reversed.append(" "); // Tambahkan spasi di antara kata, kecuali terakhir
                                }
                            }
                            return reversed.toString();
                        }
                        
                        private static void bangunRuangDatarMenu(Scanner scanner) {
        boolean subMenu = true;
        while (subMenu) {
            System.out.println("<==Bangun Ruang Datar==>");
            System.out.println("Silahkan Pilih Rumus:");
            System.out.println("1. Luas (Meter Kuadrat)");
            System.out.println("2. Volume (Liter)");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    luasMenu(scanner);
                    break;
                case 2:
                    volumeMenu(scanner);
                    break;
                case 3:
                    subMenu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void luasMenu(Scanner scanner) {
        System.out.println("Silahkan Pilih Menu:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Masukkan panjang dan lebar: ");
                double panjang = scanner.nextDouble();
                double lebar = scanner.nextDouble();
                System.out.println("Luas Persegi Panjang: " + (panjang * lebar));
                break;
            case 2:
                System.out.println("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas Persegi: " + (sisi * sisi));
                break;
            case 3:
                System.out.println("Masukkan alas dan tinggi: ");
                double alas = scanner.nextDouble();
                double tinggi = scanner.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi));
                break;
            case 4:
                System.out.println("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * jariJari * jariJari));
                break;
            case 5:
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void volumeMenu(Scanner scanner) {
        System.out.println("Pilihan Menu:");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Bola");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Masukkan panjang, lebar, dan tinggi: ");
                double panjang = scanner.nextDouble();
                double lebar = scanner.nextDouble();
                double tinggi = scanner.nextDouble();
                System.out.println("Volume Balok: " + (panjang * lebar * tinggi));
                break;
            case 2:
                System.out.println("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Volume Kubus: " + (Math.pow(sisi, 3)));
                break;
            case 3:
                System.out.println("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Volume Bola: " + ((4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3)));
                break;
            case 4:
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void konversiMenu(Scanner scanner) {
        boolean subMenu = true;
        while (subMenu) {
            System.out.println("Pilih Menu di bawah ini:");
            System.out.println("1. Derajat");
            System.out.println("2. Panjang");
            System.out.println("3. Berat (gram)");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    konversiDerajat(scanner);
                    break;
                case 2:
                    konversiPanjang(scanner);
                    break;
                case 3:
                    konversiBerat(scanner);
                                        break;
                                    case 4:
                                        subMenu = false;
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid!");
                                }
                            }
                        }
                    
                        
public static void konversiBerat(Scanner scanner) {
        while (true) {
            System.out.println("Silahkan Pilih Satuan Awal:");
            System.out.println(" 1. Kilogram");
            System.out.println(" 2. Hektogram");
            System.out.println(" 3. Dekagram");
            System.out.println(" 4. Gram");
            System.out.println(" 5. Desigram");
            System.out.println(" 6. Sentigram");
            System.out.println(" 7. Miligram");
            System.out.println(" 8. Exit");
            System.out.print("Masukkan Pilihan: ");
            int fromChoice = scanner.nextInt();
    
            if (fromChoice == 8) {
                return;
            }
    
            String fromUnit = getWeightUnitName(fromChoice);
            if (fromUnit == null) {
                System.out.println("Pilihan satuan awal tidak valid.");
                continue;
            }
    
            while (true) {
                System.out.printf("Silahkan Pilih Satuan Tujuan\n");
                System.out.printf(" 1. %s ke Kilogram\n", fromUnit);
                System.out.printf(" 2. %s ke Hektogram\n", fromUnit);
                System.out.printf(" 3. %s ke Dekagram\n", fromUnit);
                System.out.printf(" 4. %s ke Gram\n", fromUnit);
                System.out.printf(" 5. %s ke Desigram\n", fromUnit);
                System.out.printf(" 6. %s ke Sentigram\n", fromUnit);
                System.out.printf(" 7. %s ke Miligram\n", fromUnit);
                System.out.println(" 8. Exit");
                System.out.print("Masukkan Pilihan: ");
                int toChoice = scanner.nextInt();
    
                if (toChoice == 8) {
                    break; // Kembali ke menu satuan awal
                }
    
                String toUnit = getWeightUnitName(toChoice);
                if (toUnit == null) {
                    System.out.println("Pilihan satuan tujuan tidak valid.");
                    continue;
                }
    
                System.out.print("Masukkan nilai: ");
                float value = scanner.nextFloat();
    
                float valueInGrams = 0;
    
                
                switch (fromChoice) {
                    case 1: valueInGrams = value * 1000; break;
                    case 2: valueInGrams = value * 100; break;
                    case 3: valueInGrams = value * 10; break;
                    case 4: valueInGrams = value; break;
                    case 5: valueInGrams = value / 10; break;
                    case 6: valueInGrams = value / 100; break;
                    case 7: valueInGrams = value / 1000; break;
                    default: System.out.println("Pilihan satuan awal tidak valid."); continue;
                }
    
                float result = 0;
    
                
                switch (toChoice) {
                    case 1: result = valueInGrams / 1000; break;
                    case 2: result = valueInGrams / 100; break;
                    case 3: result = valueInGrams / 10; break;
                    case 4: result = valueInGrams; break;
                    case 5: result = valueInGrams * 10; break;
                    case 6: result = valueInGrams * 100; break;
                    case 7: result = valueInGrams * 1000; break;
                    default: System.out.println("Pilihan satuan tujuan tidak valid."); continue;
                }
    
                System.out.printf("Hasil Konversi: %.2f %s = %.2f %s\n", value, fromUnit, result, toUnit);
            }
        }
    }
    
    public static void convertWeight(Scanner scanner) {
        while (true) {
            System.out.println("Silahkan Pilih Satuan Awal:");
            System.out.println(" 1. Kilogram");
            System.out.println(" 2. Hektogram");
            System.out.println(" 3. Dekagram");
            System.out.println(" 4. Gram");
            System.out.println(" 5. Desigram");
            System.out.println(" 6. Sentigram");
            System.out.println(" 7. Miligram");
            System.out.println(" 8. Exit");


System.out.print("Masukkan Pilihan: ");
            int fromChoice = scanner.nextInt();
    
            if (fromChoice == 8) {
                return;
            }
    
            String fromUnit = getWeightUnitName(fromChoice);
            if (fromUnit == null) {
                System.out.println("Pilihan satuan awal tidak valid.");
                continue;
            }
    
            while (true) {
                System.out.printf("Silahkan Pilih Satuan Tujuan\n");
                System.out.printf(" 1. %s ke Kilogram\n", fromUnit);
                System.out.printf(" 2. %s ke Hektogram\n", fromUnit);
                System.out.printf(" 3. %s ke Dekagram\n", fromUnit);
                System.out.printf(" 4. %s ke Gram\n", fromUnit);
                System.out.printf(" 5. %s ke Desigram\n", fromUnit);
                System.out.printf(" 6. %s ke Sentigram\n", fromUnit);
                System.out.printf(" 7. %s ke Miligram\n", fromUnit);
                System.out.println(" 8. Exit");
                System.out.print("Masukkan Pilihan: ");
                int toChoice = scanner.nextInt();
    
                if (toChoice == 8) {
                    break;
                }
    
                String toUnit = getWeightUnitName(toChoice);
                if (toUnit == null) {
                    System.out.println("Pilihan satuan tujuan tidak valid.");
                    continue;
                }
    
                System.out.print("Masukkan nilai: ");
                float value = scanner.nextFloat();
    
                float valueInGrams = 0;
    
                
                switch (fromChoice) {
                    case 1: valueInGrams = value * 1000; break;
                    case 2: valueInGrams = value * 100; break;
                    case 3: valueInGrams = value * 10; break;
                    case 4: valueInGrams = value; break;
                    case 5: valueInGrams = value / 10; break;
                    case 6: valueInGrams = value / 100; break;
                    case 7: valueInGrams = value / 1000; break;
                    default: System.out.println("Pilihan satuan awal tidak valid."); continue;
                }
    
                float result = 0;
    
                switch (toChoice) {
                    case 1: result = valueInGrams / 1000; break;
                    case 2: result = valueInGrams / 100; break;
                    case 3: result = valueInGrams / 10; break;
                    case 4: result = valueInGrams; break;
                    case 5: result = valueInGrams * 10; break;
                    case 6: result = valueInGrams * 100; break;
                    case 7: result = valueInGrams * 1000; break;
                    default: System.out.println("Pilihan satuan tujuan tidak valid."); continue;
                }
    
                System.out.printf("Hasil Konversi: %.0f %s = %.0f %s\n", value, fromUnit, result, toUnit);
            }
        }
    }
    
    private static String getWeightUnitName(int choice) {
        switch (choice) {
            case 1: return "Kg";
            case 2: return "Hg";
            case 3: return "Dag";
            case 4: return "Gram";
            case 5: return "Dg";
            case 6: return "Sg";
            case 7: return "Mg";
            default: return null;
        }
    }          
                    
                        private static void konversiDerajat(Scanner scanner) {
                            System.out.println("Pilih Konversi Derajat:");
                            System.out.println("1. Celcius");
                            System.out.println("2. Fahrenheit");
                            System.out.println("3. Reamur");
                            System.out.println("3. Exit");

                            int inputChoice = scanner.nextInt();

                            switch (inputChoice) {
                                case 1:
                                    konversiDariCelcius(scanner);
                                    break;
                                case 2:
                                    konversiDariFahrenheit(scanner);
                                    break;
                                case 3:
                                    konversiDariReamur(scanner);
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                        }
                    
                        private static void konversiDariCelcius(Scanner scanner) {
                            System.out.println("Pilih Konversi Derajat:");
                            System.out.println("1. Celcius ke Fahrenheit");
                            System.out.println("2. Celcius ke Reamur");
                            System.out.println("3. Exit");
                    
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("Masukkan suhu dalam Celcius: ");
                                    double celcius = scanner.nextDouble();
                                    System.out.println("Hasil: " + ((celcius * 9 / 5) + 32) + " Fahrenheit");
                                    break;
                                case 2:
                                    System.out.println("Masukkan suhu dalam Celcius: ");
                                    celcius = scanner.nextDouble();
                                    System.out.println("Hasil: " + (celcius * 4 / 5) + " Reamur");
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                        }
                    
                        private static void konversiDariFahrenheit(Scanner scanner) {
                            System.out.println("Pilih Konversi Derajat:");
                            System.out.println("1. Fahrenheit ke Celcius");
                            System.out.println("2. Fahrenheit ke Reamur");
                            System.out.println("3. Exit");
                    
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("Masukkan suhu dalam Fahrenheit: ");
                                    double fahrenheit = scanner.nextDouble();
                                    System.out.println("Hasil: " + ((fahrenheit - 32) * 5 / 9) + " Celcius");
                                    break;
                                case 2:
                                    System.out.println("Masukkan suhu dalam Fahrenheit: ");
                                    fahrenheit = scanner.nextDouble();
                                    System.out.println("Hasil: " + ((fahrenheit - 32) * 4 / 9) + " Reamur");
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                        }
                    
                        private static void konversiDariReamur(Scanner scanner) {
                            System.out.println("Pilih Konversi Derajat:");
                            System.out.println("1. Reamur ke Celcius");
                            System.out.println("2. Reamur ke Fahrenheit");
                            System.out.println("3. Exit");
                    
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("Masukkan suhu dalam Reamur: ");
                                    double reamur = scanner.nextDouble();
                                    System.out.println("Hasil: " + (reamur * 5 / 4) + " Celcius");
                                    break;
                                case 2:
                                    System.out.println("Masukkan suhu dalam Reamur: ");
                                    reamur = scanner.nextDouble();
                                    System.out.println("Hasil: " + ((reamur * 9 / 4) + 32) + " Fahrenheit");
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                        }

    private static void konversiPanjang(Scanner scanner) {
        boolean panjangMenu = true;
        while (panjangMenu) {
            System.out.println("Pilih Konversi Panjang:");
            System.out.println("1. Kilometer");
            System.out.println("2. Hektometer");
            System.out.println("3. Dekameter");
            System.out.println("4. Desimeter");
            System.out.println("5. Sentimeter");
            System.out.println("6. Milimeter");
            System.out.println("7. Exit");
    
            if (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // Konsumsi input yang salah
                continue;
            }
    
            int choiceFrom = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
    
            if (choiceFrom == 7) {
                panjangMenu = false;
                continue;
            }
    
            System.out.println("Pilih Konversi Ke:");
            System.out.println("1. Kilometer");
            System.out.println("2. Hektometer");
            System.out.println("3. Dekameter");
            System.out.println("4. Desimeter");
            System.out.println("5. Sentimeter");
            System.out.println("6. Milimeter");
            System.out.println("7. Exit");
    
            if (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // Konsumsi input yang salah
                continue;
            }
    
            int choiceTo = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
    
            if (choiceTo == 7) {
                panjangMenu = false;
                continue;
            }
    
            System.out.println("Masukkan panjang yang akan dikonversi:");
            if (!scanner.hasNextDouble()) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // Konsumsi input yang salah
                continue;
            }
    
            double value = scanner.nextDouble();
    
            // Conversion factors
            double[] conversionFactors = {1000, 100, 10, 0.1, 1, 0.001}; // Kilometers to millimeters
            double valueInMeters = value * conversionFactors[choiceFrom - 1]; // Convert to meters first
    
            double result = valueInMeters / conversionFactors[choiceTo - 1]; // Convert to the target unit
    
            String[] units = {"Kilometer", "Hektometer", "Dekameter", "Desimeter", "Sentimeter", "Milimeter"};
            System.out.println("Hasil konversi: " + value + " " + units[choiceFrom - 1] + " = " + result + " " + units[choiceTo - 1]);
        }
    }
    
    }

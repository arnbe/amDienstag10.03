package edu.campus02;

    public class Beispiel1 {

        public static void main(String[] args) {
            double feuchtigkeit = 0.33;
            int pflanze = 4;

            // 1.a
            int zeitGieszen;
            zeitGieszen = gieszDauer(feuchtigkeit);

            // output
            System.out.println("Gießdauer: " + zeitGieszen);

            // 1.b
            double wasserAnteil;
            wasserAnteil = wasserGehalt(pflanze);

            // output
            System.out.println("Wasseranteil: " + wasserAnteil);
        }

        // 1.a
        static int gieszDauer(double feuchtigkeit) {
            int dauer;

            if (feuchtigkeit < 0.2) {
                dauer = 5;
            } else if (feuchtigkeit < 0.4) {
                dauer = 3;
            } else if (feuchtigkeit < 0.75) {
                dauer = 1;
            } else {
                dauer = 0;
            }

            return dauer;
        }

        // 1.b
        static double wasserGehalt(int pflanzenNummer) {
            double ergebnis = 1;

            switch (pflanzenNummer) {
                case 2:
                    ergebnis = 0.95;
                    break;
                case 3:
                    break;
                case 4:
                    ergebnis = 0.98;
                    break;
                case 1:
                default:
                    ergebnis = 0.99;
            }

            return ergebnis;
        }


            public static void main(String[] args) {
                int station = 3;
                // 2.a
                int dauer;
                dauer = zeitZumZiel(station);

                // output
                System.out.println("Dauer: " + dauer);

                // 2.b
                if (dauer == 0) {
                    System.out.println("Achtung! Ziel erreicht!");
                }

                // 2.c
                int baustellenStation = 4;
                int baustellenDauer = 6; // Minuten
                dauer = zeitZumZielMitWartezeit(station, baustellenStation, baustellenDauer);

                // output
                System.out.println("Dauer: " + dauer);
            }

            static int zeitZumZiel(int station) {
                int zeit = 0;

                switch ( station ) {
                    case 1:
                        zeit = 20;
                        break;
                    case 2:
                        zeit = 16;
                        break;
                    case 3:
                        zeit = 15;
                        break;
                    case 4:
                        zeit = 10;
                        break;
                    case 5:
                        zeit = 3;
                        break;
                }
                return zeit;
            }

            static int zeitZumZielMitWartezeit(int station, int baustellenStation, int dauer) {
                int zeit = 0;

                switch ( station ) {
                    case 1:
                        zeit = 20;
                        break;
                    case 2:
                        zeit = 16;
                        break;
                    case 3:
                        zeit = 15;
                        break;
                    case 4:
                        zeit = 10;
                        break;
                    case 5:
                        zeit = 3;
                        break;
                }

                if ( station <= baustellenStation ) {
                    zeit += dauer;
                }

                return zeit; // zeit = zeit + dauer; ist gleich wie zeit=+dauer
            }
        }



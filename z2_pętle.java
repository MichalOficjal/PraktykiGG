int a = 0;
        int b = 1;
        int x = 8;

        for(int i = 1; i < x; ++i) {
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        }
        }
        }
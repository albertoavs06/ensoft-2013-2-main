    class Particoes
    {
        private int[] array;
        private int n;
        private int cont;

        public Particoes( int n ) {
            this.n = n;
            array = new int[11];
            cont = 1;
            for (int i = 0; i <= n; i++)
            {
                array[i] = 1;
            }
        }

        public void imprimeParticoes()
        {
            
            int numConjuntos = 1;
            for (int i = 0; i < n; i++)
            {
                if ((int)this.array[i] > numConjuntos)
                {
                    numConjuntos = (int)this.array[i];
                }
            }

            System.out.print(cont + " - ");

            for (int c = numConjuntos; c >= 1; c--)
            {
            	 System.out.print("{");
                for (int j = 0; j < n; j++)
                {
                    if ((int)this.array[j] == c)
                    {
                    	 System.out.print(j + 1);
                    }
                }
                System.out.print("}");
            }
            System.out.println("");
            cont++;
        }

        public boolean existeParticaoValida()
        {
            int i = 0;
            this.array[i]++;
            array[n] = 1;

            for (int j = i + 1; j < n - 1; j++)
            {
                if (array[j] > array[n])
                    array[n] = array[j];
            }

            if (array[0] == n + 1)
                return false;

            while ((array[i] > array[n] + 1))
            {
                array[i] = 1;
                i++;
                array[i]++;
                array[n] = 1;

                for (int j = i + 1; j < n; j++)
                {
                    if (array[j] > array[n])
                        array[n] = array[j];
                }
            }

            return true;
        }


    }

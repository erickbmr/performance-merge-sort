class main
{
    public static void main(String[] args)
    {
        Merge m = new Merge();
        int[] vetor = new int[1];

        //Crescente
        System.out.println("\n\nCrescente de 10 posições");
        m.vetorCrescente(vetor, 10);
        System.out.println("\n\nCrescente de 100 posições");
        m.vetorCrescente(vetor, 100);
        System.out.println("\n\nCrescente de 1000 posições");
        m.vetorCrescente(vetor, 1000);
        
        //Decrescente
        System.out.println("\n\nDecrescente de 10 posições");
        m.vetorDecrescente(vetor, 10);
        System.out.println("\n\nDecrescente de 100 posições");
        m.vetorDecrescente(vetor, 100);
        System.out.println("\n\nDecrescente de 1000 posições");
        m.vetorDecrescente(vetor, 1000);

        //Random
        System.out.println("\n\nRandom de 10 posições");
        m.vetorRandom(vetor, 10);
        System.out.println("\n\nRandom de 100 posições");
        m.vetorRandom(vetor, 100);
        System.out.println("\n\nRandom de 1000 posições");
        m.vetorRandom(vetor, 1000);

    }
}
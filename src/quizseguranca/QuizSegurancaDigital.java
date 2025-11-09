package quizseguranca;

import java.util.Scanner;

public class QuizSegurancaDigital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("🔐 Quiz: Conectados com Consciência\n");

        String[][] perguntas = {
            {"Qual é uma boa prática de privacidade online?",
             "A) Compartilhar senhas com amigos",
             "B) Usar autenticação de dois fatores",
             "C) Postar localização em tempo real",
             "D) Usar a mesma senha em todos os sites",
             "B"},
            {"O que é uma fake news?",
             "A) Uma notícia verdadeira",
             "B) Uma opinião pessoal",
             "C) Informação falsa divulgada como verdadeira",
             "D) Um meme engraçado",
             "C"},
            {"Como combater o cyberbullying?",
             "A) Ignorar e não fazer nada",
             "B) Compartilhar o conteúdo ofensivo",
             "C) Denunciar e apoiar a vítima",
             "D) Rir junto com os agressores",
             "C"},
            {"Qual dessas atitudes ajuda a proteger seus dados?",
             "A) Usar redes Wi-Fi públicas sem proteção",
             "B) Clicar em links desconhecidos",
             "C) Atualizar seus aplicativos regularmente",
             "D) Compartilhar fotos íntimas com desconhecidos",
             "C"},
            {"O que você deve fazer ao receber uma mensagem suspeita?",
             "A) Responder imediatamente",
             "B) Compartilhar com os amigos",
             "C) Ignorar e apagar",
             "D) Verificar a origem antes de qualquer ação",
             "D"}
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println((i + 1) + ". " + perguntas[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(perguntas[i][j]);
            }
            System.out.print("Resposta: ");
            String resposta = input.nextLine();
            if (resposta.equalsIgnoreCase(perguntas[i][5])) {
                score++;
            }
            System.out.println();
        }

        System.out.println("✅ Você acertou " + score + " de " + perguntas.length + " perguntas.");
        if (score == perguntas.length) {
            System.out.println("Parabéns! Você está bem informado sobre segurança digital.");
        } else {
            System.out.println("Fique atento! Acesse nossos conteúdos e aprenda mais sobre como se proteger online.");
        }

        input.close();
    }
}

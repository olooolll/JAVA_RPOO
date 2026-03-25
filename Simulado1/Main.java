import src.Post;
import src.UserAccount;

public class Main{

    public static void main(String args[]){
        UserAccount user1 = new UserAccount("biri@gmail.com", "Biri123");
        UserAccount user2 = new UserAccount("ana.silva@gmail.com", "Ana123");
        UserAccount user3 = new UserAccount("carlos.dev@gmail.com", "Carlos123");
        UserAccount user4 = new UserAccount("marina.oliveira@gmail.com", "Marina123");
        UserAccount user5 = new UserAccount("joao.santos@gmail.com", "Joao123");
        UserAccount user6 = new UserAccount("fernanda.lima@gmail.com", "Fernanda123");
        UserAccount user7 = new UserAccount("pedro.rocha@gmail.com", "Pedro123");
        UserAccount user8 = new UserAccount("lucas.melo@gmail.com", "Lucas123");
        UserAccount user9 = new UserAccount("bianca.costa@gmail.com", "Bianca123");
        UserAccount user10 = new UserAccount("rafael.alves@gmail.com", "Rafael123");
        UserAccount user11 = new UserAccount("camila.freitas@gmail.com", "Camila123");
        UserAccount user12 = new UserAccount("thiago.pereira@gmail.com", "Thiago123");
        UserAccount user13 = new UserAccount("isabela.ramos@gmail.com", "Isabela123");
        UserAccount user14 = new UserAccount("gustavo.martins@gmail.com", "Gustavo123");
        UserAccount user15 = new UserAccount("aline.barbosa@gmail.com", "Aline123");
        UserAccount user16 = new UserAccount("bruno.teixeira@gmail.com", "Bruno123");
        UserAccount user17 = new UserAccount("patricia.gomes@gmail.com", "Patricia123");

        user1.acceptFollower(user2);
        user1.acceptFollower(user5);
        user1.acceptFollower(user8);
        user1.blockFollower(user4);

        user2.acceptFollower(user1);
        user2.acceptFollower(user6);
        user2.blockFollower(user3);
        user2.acceptFollower(user10);

        user3.acceptFollower(user7);
        user3.acceptFollower(user9);
        user3.blockFollower(user2);
        user3.acceptFollower(user11);

        user4.acceptFollower(user1);
        user4.blockFollower(user8);
        user4.acceptFollower(user12);
        user4.acceptFollower(user15);

        user5.acceptFollower(user3);
        user5.acceptFollower(user6);
        user5.blockFollower(user9);
        user5.acceptFollower(user14);

        user6.acceptFollower(user2);
        user6.acceptFollower(user5);
        user6.blockFollower(user10);
        user6.acceptFollower(user16);

        user7.acceptFollower(user4);
        user7.acceptFollower(user11);
        user7.blockFollower(user1);
        user7.acceptFollower(user13);

        user8.acceptFollower(user3);
        user8.acceptFollower(user7);
        user8.blockFollower(user5);
        user8.acceptFollower(user17);

        user9.acceptFollower(user2);
        user9.acceptFollower(user6);
        user9.blockFollower(user12);
        user9.acceptFollower(user15);

        user10.acceptFollower(user1);
        user10.acceptFollower(user8);
        user10.blockFollower(user4);
        user10.acceptFollower(user13);

        user11.acceptFollower(user5);
        user11.acceptFollower(user9);
        user11.blockFollower(user7);
        user11.acceptFollower(user14);

        user12.acceptFollower(user3);
        user12.acceptFollower(user10);
        user12.blockFollower(user6);
        user12.acceptFollower(user16);

        user13.acceptFollower(user2);
        user13.acceptFollower(user11);
        user13.blockFollower(user8);
        user13.acceptFollower(user17);

        user14.acceptFollower(user4);
        user14.acceptFollower(user7);
        user14.blockFollower(user1);
        user14.acceptFollower(user12);

        user15.acceptFollower(user5);
        user15.acceptFollower(user13);
        user15.blockFollower(user2);
        user15.acceptFollower(user9);

        user16.acceptFollower(user6);
        user16.acceptFollower(user14);
        user16.blockFollower(user11);
        user16.acceptFollower(user1);

        user17.acceptFollower(user8);
        user17.acceptFollower(user15);
        user17.blockFollower(user3);
        user17.acceptFollower(user10);


        user1.publish("Tomou na Jabiraca");
        user1.publish("Hoje o café bateu diferente.");
        user1.publish("Partiu resolver bug até tarde.");

        user2.publish("Bom dia com preguiça.");
        user2.publish("Nada melhor que um código funcionando de primeira.");

        user3.publish("Deploy em produção sem medo.");
        user3.publish("Java salvando vidas desde cedo.");
        user3.publish("Hoje é dia de backend.");

        user4.publish("Só queria férias e um pix.");
        user4.publish("Mais um dia vencendo no ódio.");

        user5.publish("Erro? Nunca vi, sempre foi feature.");
        user5.publish("Estudando enquanto todo mundo dorme.");
        user5.publish("Foco no projeto!");

        user6.publish("Frontend bonito, backend quebrado.");
        user6.publish("A luta diária do programador.");
        user6.publish("Cafeína e coragem.");

        user7.publish("Se compilar, tá ótimo.");
        user7.publish("Hoje tem commit!");

        user8.publish("Bora pra mais uma sprint.");
        user8.publish("Não era bug, era requisito mal explicado.");
        user8.publish("Só vai!");

        user9.publish("Reunião que poderia ser um e-mail.");
        user9.publish("Produtividade a mil hoje.");

        user10.publish("Acordei inspirado pra codar.");
        user10.publish("Nada pode parar um dev motivado.");
        user10.publish("Hoje sai essa feature.");

        user11.publish("Segunda-feira com cara de sexta.");
        user11.publish("Testando tudo antes de quebrar tudo.");

        user12.publish("Só mais um commit e eu paro.");
        user12.publish("Mentira, vão ser mais dez commits.");
        user12.publish("A madrugada é dos fortes.");

        user13.publish("Corrigindo erro que eu mesmo criei.");
        user13.publish("Vivendo e aprendendo no stack trace.");

        user14.publish("Dia bonito pra programar.");
        user14.publish("Banco de dados cooperando, milagre.");
        user14.publish("Subindo projeto com fé.");

        user15.publish("Hoje eu tô no modo produtividade.");
        user15.publish("Quem nunca quebrou produção que atire a primeira exception.");

        user16.publish("Tudo dando certo até abrir o console.");
        user16.publish("Mais café, menos problema.");
        user16.publish("A persistência vence.");

        user17.publish("Tomou na Jabiraca");
        user17.publish("Hoje ninguém me segura.");
        user17.publish("Se der erro, eu finjo que não vi.");

        user1.publish("Tomou na Jabiraca");
        user1.publish("Hoje o café bateu diferente.");
        user1.publish("Partiu resolver bug até tarde.");

        user2.publish("Bom dia com preguiça.");
        user2.publish("Nada melhor que um código funcionando de primeira.");

        user3.publish("Deploy em produção sem medo.");
        user3.publish("Java salvando vidas desde cedo.");
        user3.publish("Hoje é dia de backend.");

        user4.publish("Só queria férias e um pix.");
        user4.publish("Mais um dia vencendo no ódio.");

        user5.publish("Erro? Nunca vi, sempre foi feature.");
        user5.publish("Estudando enquanto todo mundo dorme.");
        user5.publish("Foco no projeto!");

        user6.publish("Frontend bonito, backend quebrado.");
        user6.publish("A luta diária do programador.");
        user6.publish("Cafeína e coragem.");

        user7.publish("Se compilar, tá ótimo.");
        user7.publish("Hoje tem commit!");

        user8.publish("Bora pra mais uma sprint.");
        user8.publish("Não era bug, era requisito mal explicado.");
        user8.publish("Só vai!");

        user9.publish("Reunião que poderia ser um e-mail.");
        user9.publish("Produtividade a mil hoje.");

        user10.publish("Acordei inspirado pra codar.");
        user10.publish("Nada pode parar um dev motivado.");
        user10.publish("Hoje sai essa feature.");

        user11.publish("Segunda-feira com cara de sexta.");
        user11.publish("Testando tudo antes de quebrar tudo.");

        user12.publish("Só mais um commit e eu paro.");
        user12.publish("Mentira, vão ser mais dez commits.");
        user12.publish("A madrugada é dos fortes.");

        user13.publish("Corrigindo erro que eu mesmo criei.");
        user13.publish("Vivendo e aprendendo no stack trace.");

        user14.publish("Dia bonito pra programar.");
        user14.publish("Banco de dados cooperando, milagre.");
        user14.publish("Subindo projeto com fé.");

        user15.publish("Hoje eu tô no modo produtividade.");
        user15.publish("Quem nunca quebrou produção que atire a primeira exception.");

        user16.publish("Tudo dando certo até abrir o console.");
        user16.publish("Mais café, menos problema.");
        user16.publish("A persistência vence.");

        user17.publish("Tomou na Jabiraca");
        user17.publish("Hoje ninguém me segura.");
        user17.publish("Se der erro, eu finjo que não vi.");


        user1.clapPost(0);
        user1.clapPost(3);
        user1.booPost(5);
        user1.clapPost(7);

        user2.booPost(0);
        user2.clapPost(2);
        user2.clapPost(4);
        user2.booPost(8);

        user3.clapPost(1);
        user3.clapPost(3);
        user3.booPost(6);
        user3.clapPost(9);

        user4.booPost(2);
        user4.clapPost(5);
        user4.clapPost(7);
        user4.booPost(1);

        user5.clapPost(0);
        user5.clapPost(0);
        user5.booPost(4);
        user5.clapPost(8);

        user6.booPost(3);
        user6.clapPost(6);
        user6.clapPost(9);
        user6.booPost(2);

        user7.clapPost(1);
        user7.booPost(5);
        user7.clapPost(5);
        user7.clapPost(7);

        user8.clapPost(2);
        user8.clapPost(4);
        user8.booPost(6);
        user8.booPost(9);

        user9.booPost(0);
        user9.clapPost(3);
        user9.clapPost(8);
        user9.booPost(7);

        user10.clapPost(1);
        user10.clapPost(2);
        user10.booPost(5);
        user10.clapPost(9);

        user11.booPost(4);
        user11.clapPost(6);
        user11.clapPost(6);
        user11.booPost(8);

        user12.clapPost(0);
        user12.booPost(1);
        user12.clapPost(3);
        user12.clapPost(7);

        user13.booPost(2);
        user13.clapPost(5);
        user13.booPost(9);
        user13.clapPost(4);

        user14.clapPost(1);
        user14.clapPost(8);
        user14.booPost(3);
        user14.clapPost(0);

        user15.booPost(6);
        user15.clapPost(7);
        user15.clapPost(2);
        user15.booPost(4);

        user16.clapPost(5);
        user16.clapPost(5);
        user16.booPost(0);
        user16.clapPost(9);

        user17.booPost(1);
        user17.clapPost(3);
        user17.clapPost(6);
        user17.booPost(8);

        System.out.println("\n==================== USER 1 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user1.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user1.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user1.showMyFriends());

        System.out.println("\n==================== USER 2 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user2.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user2.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user2.showMyFriends());

        System.out.println("\n==================== USER 3 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user3.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user3.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user3.showMyFriends());

        System.out.println("\n==================== USER 4 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user4.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user4.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user4.showMyFriends());

        System.out.println("\n==================== USER 5 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user5.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user5.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user5.showMyFriends());

        System.out.println("\n==================== USER 6 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user6.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user6.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user6.showMyFriends());

        System.out.println("\n==================== USER 7 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user7.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user7.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user7.showMyFriends());

        System.out.println("\n==================== USER 8 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user8.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user8.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user8.showMyFriends());

        System.out.println("\n==================== USER 9 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user9.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user9.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user9.showMyFriends());

        System.out.println("\n==================== USER 10 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user10.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user10.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user10.showMyFriends());

        System.out.println("\n==================== USER 11 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user11.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user11.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user11.showMyFriends());

        System.out.println("\n==================== USER 12 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user12.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user12.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user12.showMyFriends());

        System.out.println("\n==================== USER 13 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user13.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user13.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user13.showMyFriends());

        System.out.println("\n==================== USER 14 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user14.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user14.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user14.showMyFriends());

        System.out.println("\n==================== USER 15 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user15.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user15.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user15.showMyFriends());

        System.out.println("\n==================== USER 16 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user16.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user16.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user16.showMyFriends());

        System.out.println("\n==================== USER 17 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user17.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user17.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user17.showMyFriends());


        user1.delete(2);
        user1.delete(7);

        user2.delete(1);
        user2.delete(4);

        user3.delete(0);
        user3.delete(6);

        user4.delete(3);
        user4.delete(8);

        user5.delete(2);
        user5.delete(5);

        user6.delete(1);
        user6.delete(9);

        user7.delete(0);
        user7.delete(4);

        user8.delete(3);
        user8.delete(7);

        user9.delete(2);
        user9.delete(6);

        user10.delete(5);
        user10.delete(8);

        user11.delete(1);
        user11.delete(3);

        user12.delete(0);
        user12.delete(9);

        user13.delete(2);
        user13.delete(4);

        user14.delete(6);
        user14.delete(7);

        user15.delete(1);
        user15.delete(5);

        user16.delete(0);
        user16.delete(8);

        user17.delete(3);
        user17.delete(9);

        user5.delete(0);
        user8.delete(1);
        user10.delete(2);
        user14.delete(4);
        user16.delete(6);
        user3.delete(5);
        user12.delete(7);
        user6.delete(3);

        System.out.println("\n==================== USER 1 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user1.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user1.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user1.showMyFriends());

        System.out.println("\n==================== USER 2 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user2.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user2.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user2.showMyFriends());

        System.out.println("\n==================== USER 3 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user3.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user3.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user3.showMyFriends());

        System.out.println("\n==================== USER 4 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user4.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user4.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user4.showMyFriends());

        System.out.println("\n==================== USER 5 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user5.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user5.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user5.showMyFriends());

        System.out.println("\n==================== USER 6 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user6.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user6.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user6.showMyFriends());

        System.out.println("\n==================== USER 7 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user7.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user7.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user7.showMyFriends());

        System.out.println("\n==================== USER 8 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user8.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user8.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user8.showMyFriends());

        System.out.println("\n==================== USER 9 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user9.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user9.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user9.showMyFriends());

        System.out.println("\n==================== USER 10 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user10.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user10.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user10.showMyFriends());

        System.out.println("\n==================== USER 11 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user11.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user11.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user11.showMyFriends());

        System.out.println("\n==================== USER 12 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user12.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user12.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user12.showMyFriends());

        System.out.println("\n==================== USER 13 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user13.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user13.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user13.showMyFriends());

        System.out.println("\n==================== USER 14 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user14.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user14.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user14.showMyFriends());

        System.out.println("\n==================== USER 15 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user15.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user15.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user15.showMyFriends());

        System.out.println("\n==================== USER 16 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user16.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user16.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user16.showMyFriends());

        System.out.println("\n==================== USER 17 ====================");
        System.out.println("\n--- MEUS POSTS ---");
        System.out.printf(user17.showMyPosts());
        System.out.println("\n--- TIMELINE ---");
        System.out.printf(user17.showTimeline());
        System.out.println("\n--- AMIGOS / SEGUIDORES ---");
        System.out.printf(user17.showMyFriends());
    }

}
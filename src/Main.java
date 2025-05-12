
import Proxy.*;

public class Main {
    public static void main(String[] args) {
        ContactService realService = new ContactServiceImpl();
        ContactService proxy = new ContactServiceProxy((ContactServiceImpl) realService);

        proxy.getContact("Ana");
        proxy.getContact("Bruno");
        proxy.getContact("Carlos");
        proxy.getContact("Diana");
        proxy.getContact("Eduardo");

        proxy.getContact("Ana");    // do cache
        proxy.getContact("Fátima"); // novo, força remoção do mais antigo
        proxy.getContact("Bruno");  // pode ainda estar no cache (LRU)

        // Para testar o efeito LRU, acesse Ana novamente após 5 novos
    }
}


import java.util.ArrayList;

public class ClientQueue {
    private ArrayList<Client> clients = new ArrayList();
    private ClientListener listeners = new ClientListener(){
        @Override
        public void clientAdded(ClientEvent event) {
            System.out.println("Client added: " + event.getName());
        }
        @Override
        public void clientRemoved(ClientEvent event) {
            System.out.println("Client removed: " + event.getName());
        }
        @Override
        public void clientpayed(ClientEvent event) {
            System.out.println("Client payed: " + event.getName());
        }
    };

    public ArrayList<Client> getClient() {
        return clients;
    }



            
   // public void addClientListener(ClientListener listener) {
   //     listeners.add(listener);
   //}
    
    public void enqueue(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        listeners.clientAdded(event);
    }

    public void payed(Client client) {
        var event = new ClientEvent(client);
        listeners.clientpayed(event);
    }
    
    public void dequeue(Client client) {
        clients.remove(client);
        var event = new ClientEvent(client);
        listeners.clientRemoved(event);
    }
}
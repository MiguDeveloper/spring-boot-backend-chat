package pe.tuna.springbootbackendchat.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.tuna.springbootbackendchat.models.documents.Mensaje;
import pe.tuna.springbootbackendchat.models.repository.IChatRepository;

import java.util.List;

@Service
public class ChatServiceImpl implements IChatService {

    @Autowired
    private IChatRepository chatRepository;

    @Override
    public List<Mensaje> obtenerUltimos10Mensajes() {
        return chatRepository.findFirst10ByOrderByFechaDesc();
    }

    @Override
    public Mensaje guardar(Mensaje mensaje) {
        return chatRepository.save(mensaje);
    }
}

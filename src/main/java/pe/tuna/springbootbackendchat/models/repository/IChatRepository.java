package pe.tuna.springbootbackendchat.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pe.tuna.springbootbackendchat.models.documents.Mensaje;

import java.util.List;

public interface IChatRepository extends MongoRepository<Mensaje, String> {
    public List<Mensaje> findFirst10ByOrderByFechaDesc();
}

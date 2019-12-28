package pe.tuna.springbootbackendchat.models.services;

import pe.tuna.springbootbackendchat.models.documents.Mensaje;

import java.util.List;

public interface IChatService {
    public List<Mensaje> obtenerUltimos10Mensajes();
    public Mensaje guardar(Mensaje mensaje);
}

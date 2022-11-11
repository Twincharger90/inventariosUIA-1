package uia.com.inventarios;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SolicitudEntregaMaterial extends SolicitudSalidaMaterial{

    public SolicitudEntregaMaterial(SolicitudSalidaMaterial solicitando) {
        super(solicitando.getId(), solicitando.getItems().toString(),solicitando.getName(), solicitando.getCategoria(), solicitando.getPartida(), solicitando.getSubpartida(), solicitando.getDescripcion(), solicitando.getCantidad());
    }

    public SolicitudEntregaMaterial() {

    }



    @Override
    public void serializa() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("solicitudEntregaMaterial-1.json"), this);
    }

}

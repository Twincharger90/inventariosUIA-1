package uia.com.inventarios;

public class SolicitudCompraTemporal extends SolicitudMaterialTemporal {


    public SolicitudCompraTemporal(SolicitudSalidaMaterial solicitando, String lote, String ubicacion) {
        super(solicitando, lote, ubicacion);
    }

    public SolicitudCompraTemporal(String lote, String ubicacion) {
        super(lote, ubicacion);
    }

    /*
    public String busca(SolicitudCompraTemporal ubicando)
    {
        if(this.getUbicacion(getCantidad()) >0)
        {
            if (this.getItems().get(idPartida).getItems().get(idSubpartida) != null)
            {
                if (this.getItems().get(idPartida).getItems().get(idSubpartida).getItems().get(idCat) != null)
                {
                    CategoriaInventario cat = (CategoriaInventario) this.getItems().get(idPartida).getItems().get(idSubpartida).getItems().get(idCat);
                    return cat.getCantidad();
                }
            }
        }
        return "";
    }*/
}

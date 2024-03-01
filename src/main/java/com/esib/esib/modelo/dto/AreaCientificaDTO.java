package com.esib.esib.modelo.dto;

import java.util.logging.Logger;
import lombok.Data;

/**
 *
 * @author Meldo Maunze
 */
@Data

public class AreaCientificaDTO {
    private Long id;
    private String descricao;
    private static final Logger LOG = Logger.getLogger(AreaCientificaDTO.class.getName());
}

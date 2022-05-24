package br.com.wolf.transactionbff.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransactionDto {

    @Schema(description = "Código de identificação da transação")
    private UUID uuid;

}



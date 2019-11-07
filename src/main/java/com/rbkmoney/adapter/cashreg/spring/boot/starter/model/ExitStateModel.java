package com.rbkmoney.adapter.cashreg.spring.boot.starter.model;

import com.rbkmoney.damsel.cashreg.CashRegInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExitStateModel {
    private String errorCode;
    private String errorMessage;
    private AdapterState adapterContext;
    private EntryStateModel entryStateModel;
    private String cashRegId;
    private CashRegInfo cashRegInfo;
}

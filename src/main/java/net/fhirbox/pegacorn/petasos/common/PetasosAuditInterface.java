/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fhirbox.pegacorn.petasos.common;

import java.util.List;

/**
 *
 * @author mhunter
 */
public interface PetasosAuditInterface {
    public PetasosAuditEntryState addEntry(PetasosParcel auditTrailEntryPayload, PetasosToken predecessorToken, List<PetasosToken> successorTokenList);
    
}

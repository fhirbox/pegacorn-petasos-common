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
public interface PetasosPeerInterface {
    public PetasosToken commenceActivity( PetasosParcel commencementParcel, PetasosToken predecessorToken );
    public PetasosNodeState finaliseActivity( PetasosToken activityToken, PetasosParcel finalisationParcel, List<PetasosToken> successorTokenList);
    public PetasosActivityState getActivityState(PetasosToken activityToken);
    
    public boolean isThisNodeTheCurrentMaster(PetasosToken activityToken);
    public boolean setThisNodeAsCurrentMaster(PetasosToken activityToken);
    public boolean isCurrentMasterNodeActive(PetasosToken activityToken);
}

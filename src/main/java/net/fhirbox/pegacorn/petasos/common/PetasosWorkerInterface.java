/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fhirbox.pegacorn.petasos.common;

/**
 *
 * @author mhunter
 */
public interface PetasosWorkerInterface {
    public void addInterestedNode(PetasosNode interestedNode, PetasosToken tokenOfInterest);
    public void addParcel(PetasosParcel parcel);
    public void flushParcel(PetasosToken token);
    public boolean isOtherNodeIsProcessing(PetasosToken tokenOfInterest);
    public boolean isThisNodeToProcess(PetasosToken tokenOfInterest);
    
}

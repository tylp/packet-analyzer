package com.tylp;

public class Packet {
    
    public static enum MESSAGE_TYPE {
        EMISSION, // Emission
        CONFIMRATION, // Emission
        RECEPTION,  // Réception
        AFFICHER, // Emission
        EFFACER,  // Emission
        RAFRAICHIR, // Emission
        INDICATION // Réception
    };

    public static enum SYSTEM_STATUS {
        OK,
        WARNING,
        ERROR
    };

    /**
     * ==================== HEADER ============
     * 1 : date
     * 2 : ?
     * 3 : taille
     * 4 : status
     * 5 : int (?)
     * 6 : message_type () 
     * 7 : int (?)
     * ================== BODY ===========
     * 8 : Message CREF=xx/num=yy
     * 9 : int (?)
     * 10: ECU local
     * 11:  int (?)
     * ...
     * 16:  - SOURCE=ECU --> Réception
     *      - DESTINATAIRE=ECU --> Emission
     *      - EMETTEUR=ECU --> Réception
     */

}

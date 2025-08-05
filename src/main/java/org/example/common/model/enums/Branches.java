package org.example.common.model.enums;

public enum Branches {
    CARDIOLOGY("Cardiology"),
    NEUROLOGY("Neurology"),
    ORTHOPEDICS("Orthopedics"),
    PEDIATRICS("Pediatrics"),
    DERMATOLOGY("Dermatology"),
    PSYCHIATRY("Psychiatry"),
    GYNECOLOGY("Gynecology"),
    UROLOGY("Urology"),
    OPHTHALMOLOGY("Ophthalmology"),
    ENT("ENT"),
    GENERAL_SURGERY("General Surgery"),
    INTERNAL_MEDICINE("Internal Medicine");

    private final String displayName;

    Branches(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

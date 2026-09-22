package com.gharpayy.gharpayybackend.FollowUp;

import jakarta.persistence.*;

@Entity
@Table(name = "follow_ups")
public class FollowUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String leadId;
    private String leadName;
    private String dueAt;
    private String note;

    public Long getId() { return id; }

    public String getLeadId() { return leadId; }
    public void setLeadId(String leadId) { this.leadId = leadId; }

    public String getLeadName() { return leadName; }
    public void setLeadName(String leadName) { this.leadName = leadName; }

    public String getDueAt() { return dueAt; }
    public void setDueAt(String dueAt) { this.dueAt = dueAt; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}

const API = "http://localhost:8085";

export async function saveMovementCare(data: {
  leadId: string;
  leadName: string;
  leadPhone: string;
  label: string;
  kind: string;
  dueAt: string;
  ownerId: string;
  ownerName: string;
  note: string;
}) {
  const response = await fetch(`${API}/api/movement-care`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  });

  if (!response.ok) {
    throw new Error(`Movement CARE request failed: ${response.status}`);
  }

  return response.json();
}
export async function saveSplit(split: {
  leadId: string;
  leadName: string;
  ownerName: string;
  splitType: string;
  status: string;
  note: string;
}) {
  const response = await fetch("http://localhost:8085/api/splits", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(split),
  });

  if (!response.ok) {
    throw new Error("Failed to save split");
  }

  return response.json();
}
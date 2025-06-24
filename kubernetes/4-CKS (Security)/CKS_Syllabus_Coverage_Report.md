
---

# 🧾 **CKS_Syllabus_Coverage_Report**

## 📘 Official CKS Domains & Mapped Project Coverage

| Domain 🧩                                             | Weight | Week Covered | ✅ Coverage Details |
|-------------------------------------------------------|--------|---------------|----------------------|
| **1. Cluster Setup**                                  | 10%    | Week 1, 4     | kubeadm hardened install, audit logging, encryption config, TLS secrets |
| **2. Cluster Hardening**                              | 15%    | Week 1, 2, 4  | kubelet flags, RBAC policies, SA token protection, PodSecurityAdmission |
| **3. System Hardening**                               | 15%    | Week 1, 2     | CIS benchmark (kube-bench), seccomp, AppArmor, host hardening |
| **4. Minimize Microservice Vulnerabilities**          | 20%    | Week 2        | Pod securityContext, PSA (baseline/restricted), unprivileged workloads |
| **5. Supply Chain Security**                          | 20%    | Week 3        | Image scanning (Trivy, Syft), signing (Cosign), SBOM, trusted registries |
| **6. Monitoring, Logging & Runtime Security**         | 20%    | Week 5        | Falco runtime detection, audit logs, custom detection rules |

---

## ✅ Full Domain Coverage Summary

| Area                           | Status  | Notes |
|--------------------------------|---------|-------|
| Cluster installation & TLS     | ✅ Full | kubeadm + encryption + audit |
| RBAC + Admission controllers   | ✅ Full | RoleBindings + PSA/OPA       |
| Pod/Container securityContext  | ✅ Full | runAsNonRoot, readOnlyFS     |
| Network and secrets security   | ✅ Full | NetworkPolicy + secrets enc. |
| Image trust & supply chain     | ✅ Full | Signed + scanned images      |
| Runtime security & detection   | ✅ Full | Falco alerting + audit logs  |
| Optional extras                | 🟡 Bonus | MutatingWebhook, Kyverno     |

---

## 🛠 Tools Practiced in Project Labs

| Category           | Tools Used |
|--------------------|------------|
| Cluster Hardening  | `kube-bench`, `auditd`, `etcdctl` |
| Workload Security  | `PodSecurity`, `AppArmor`, `seccomp` |
| Image Security     | `trivy`, `syft`, `grype`, `cosign` |
| Policy Enforcement | `OPA`, `Gatekeeper`, `Kyverno` |
| Runtime Detection  | `Falco`, `audit-policy.yaml` |

---

## 🏁 Final Verdict: ✅ **100% Syllabus Covered**

You’re ready for the CKS exam if:
- You’ve completed the 5-week plan + projects
- Practiced RBAC, PSA, Admission Controllers, Falco, and image signing
- Tested all configurations under CLI constraints
- Used tools like **trivy**, **cosign**, **Falco**, **OPA**, and **kube-bench**

---


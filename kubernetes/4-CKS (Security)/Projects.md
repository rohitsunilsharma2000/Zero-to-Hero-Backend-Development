
---

# 🧩 **CKS Learning Task Plan with Projects (Week-wise – Full Syllabus)**

> 🎯 Duration: **5 Weeks**  
> 📦 Prerequisite: CKA-certified and comfortable with `kubectl`, YAML, and Linux basics  
> ✅ Outcome: Full coverage of CKS domains with real-world, exam-like project labs

---

## 🗓️ **Week 1 – Cluster & System Hardening**
> 🔐 Domain: **Cluster Setup (10%) + System Hardening (15%)**

### ✅ Tasks:
- Install Kubernetes (kubeadm) with minimal surface area
- Harden kube-apiserver flags (`--audit-log`, `--authorization-mode=RBAC`)
- Secure etcd: enable encryption + TLS, backup/restore using `etcdctl`
- Lock down `kubelet` config (`--read-only-port=0`, `--anonymous-auth=false`)
- Scan using `kube-bench`

### 💻 Project: **"Secure Foundation Cluster"**
📂 `/cks-week1-cluster-hardening/`
- Hardened kubeadm cluster setup
- Enabled audit logs and TLS on control-plane
- Etcd encrypted + backed up
- Kube-bench results exported and explained

---

## 🗓️ **Week 2 – Pod & Workload Security**
> 🧱 Domain: **Cluster Hardening (15%) + Minimize Microservice Vulnerabilities (20%)**

### ✅ Tasks:
- Enforce PodSecurityAdmission (PSA) on namespace level
- Use `securityContext`: `runAsNonRoot`, `readOnlyRootFilesystem`, capabilities
- Test Restricted, Baseline pod levels
- Use AppArmor + seccomp profiles
- Validate with Gatekeeper or Kyverno

### 💻 Project: **"Restrict Everything Deployment"**
📂 `/cks-week2-pod-security/`
- Deploy app restricted by seccomp + AppArmor
- Test privilege escalation attempts (denied)
- Apply `restricted` PodSecurity label to namespace
- Custom OPA policy via Gatekeeper to deny `hostPath` mounts

---

## 🗓️ **Week 3 – Supply Chain & Image Security**
> 📦 Domain: **Supply Chain Security (20%)**

### ✅ Tasks:
- Scan images with `trivy`, `kubesec`, `syft`, `grype`
- Use distroless or Alpine-based containers
- Sign and verify images with `cosign`
- Enforce image repository policies via OPA/Kyverno
- Generate and validate SBOMs

### 💻 Project: **"Trusted Image Pipeline"**
📂 `/cks-week3-supply-chain/`
- Docker image scanned, signed, and deployed
- SBOM exported with Syft
- Enforced rule: allow only signed images
- Deploy OPA rule that restricts untrusted registries

---

## 🗓️ **Week 4 – RBAC, Secrets & NetworkPolicy**
> 🔐 Domain: **Cluster Hardening (15%) + Cluster Setup (10%)**

### ✅ Tasks:
- Write least-privilege Roles and Bindings
- Lock down ServiceAccounts + limit token mounting
- Encrypt Secrets at rest using `EncryptionConfig`
- Configure TLS secrets and key rotation
- Write deny-all + allow-specific NetworkPolicies

### 💻 Project: **"Zero Trust App Namespace"**
📂 `/cks-week4-rbac-network/`
- Role for read-only access to pods
- Secret encrypted at rest (config file + static key)
- Deny-all traffic by default; selectively allow namespace traffic
- TLS secret used for Ingress termination

---

## 🗓️ **Week 5 – Runtime Threat Detection & Final Review**
> 🛡️ Domain: **Monitoring, Logging & Runtime Security (20%)**

### ✅ Tasks:
- Deploy **Falco** (or Tetragon) and test rule set
- Simulate pod escape or shell in container (Falco alert)
- Customize Falco rules for sensitive binaries
- Analyze Kubernetes audit logs
- Simulate exam using **killer.sh**

### 💻 Project: **"Falco Defense System"**
📂 `/cks-week5-runtime-detection/`
- Falco daemonset deployed
- Live detection of `bash`, `nc`, `curl` inside container
- Custom rules to alert on capability changes
- Audit log config exported from `kube-apiserver`

---

## ✅ Bonus Task Bank (Optional)
| Task | Tools |
|------|-------|
| Setup Validating/MutatingAdmissionWebhook | OPA, Kyverno |
| Limit resource usage across namespaces | ResourceQuotas |
| Upgrade a live cluster and re-apply hardening | kubeadm, backup tools |
| Setup egress firewall with Calico policies | Calico, Cilium |
| Create service mesh with TLS + audit | Istio or Linkerd (advanced) |

---

## 🧪 Tool Stack Summary

| Category        | Tools                                   |
|-----------------|------------------------------------------|
| Hardening       | `kube-bench`, `etcdctl`, `auditd`        |
| SecurityContext | `seccomp`, `AppArmor`, PSA, Kyverno      |
| Image Security  | `trivy`, `cosign`, `syft`, `grype`       |
| Runtime Defense | `Falco`, `opa`, `audit-policy.yaml`      |
| Enforcement     | `Kyverno`, `OPA Gatekeeper`              |
| Logging         | `kubectl logs`, `audit logs`, `Promtail` |

---


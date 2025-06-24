
---

## 🛡️ CKS Exam Domains & Weightings

| Domain (Weight)                                     | Key Objectives                                                                                                                                                                                                        |
| --------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1. Cluster Setup – 10%**                          | Secure cluster architecture: install & configure Kubernetes with hardened settings; set up NetworkPolicies and Pod Security Standards; verify binaries and secure node metadata ([kodekloud.com][1], [github.com][2]) |
| **2. Cluster Hardening – 15%**                      | Harden API servers and control plane components; apply RBAC and least-privileged access; enforce admission control                                                                                                    |
| **3. System Hardening – 15%**                       | Secure host OS and kernel: apply AppArmor, seccomp, CIS benchmarks on etcd/kubelet/kube-proxy                                                                                                                         |
| **4. Minimize Microservice Vulnerabilities – 20%**  | Reduce risk in applications: minimize container images, use Pod Security Standards, enforce isolation with PSAs or sandbox runtimes                                                                                   |
| **5. Supply Chain Security – 20%**                  | Secure the CI/CD pipeline: image scan (KubeLinter, Kubesec), sign and validate artifacts, manage SBOM, restrict registry use                                                                                          |
| **6. Monitoring, Logging & Runtime Security – 20%** | Detect and respond to threats: use Falco, audit logs, runtime protection, behavioral analytics, detect anomalous syscalls                                                                                             |

---

## 🕒 Exam Overview

* **Format**: 2‑hour, **performance-based CLI** exam (hands-on scenarios) ([training.linuxfoundation.org][3])
* **Prerequisite**: Valid CKA (ever held) ([training.linuxfoundation.org][3])
* **Kubernetes Version**: Typically aligned with minor version \~4–8 weeks post-release (v1.32–v1.33) ([training.linuxfoundation.org][3])
* **Passing Score**: \~67% (varies by iteration)&#x20;
* **Cost**: USD 445 (includes one retake) ([training.linuxfoundation.org][3])

---

## ✅ Summary

CKS focuses on securing the full Kubernetes lifecycle—from cluster configuration, host hardening, application safety, to runtime defense and supply chain integrity.

---
backend “consul” {
    address = “consul:8500”
    scheme = "http"
    token = "devroot"
    path = “vault/”
}
listener “tcp” {
    address = “0.0.0.0:8200”
    tls_disable = 1
}
disable_mlock = true
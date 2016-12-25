yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Product')
    }
    body {
        h1("Hello from PRODUCT APP")
        div("<esi:include src=\"/user/\"/>")
    }
}
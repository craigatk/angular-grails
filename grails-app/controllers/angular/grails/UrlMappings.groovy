package angular.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'index')
        "500"(view: '/application/serverError')
        "404"(view: '/application/notFound')
    }
}
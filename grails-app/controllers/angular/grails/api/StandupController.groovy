package angular.grails.api

import angular.grails.Standup
import grails.rest.*
import grails.converters.*

class StandupController extends RestfulController<Standup>{

    StandupController() {
        super(Standup)
    }

    def index() {
        render Standup.list() as JSON
    }

    def show(Long id) {
        render Standup.get(id) as JSON
    }
}

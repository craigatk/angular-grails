package angular.grails

class Standup {
    String workedYesterday
    String todayPlans
    String impediments

    static constraints = {
        workedYesterday(nullable: true, blank: true)
        todayPlans(nullable: true, blank: true)
        impediments(nullable: true, blank: true)
    }
}

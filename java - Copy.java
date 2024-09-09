(function runAction(email, email_action, event) {
    var incident = new GlideRecord('incident');
    incident.initialize();
    incident.short_description = email.subject;
    incident.description = email.body_text;
    incident.caller_id.setDisplayValue(email.origemail);
    incident.insert();
})(email, email_action, event);

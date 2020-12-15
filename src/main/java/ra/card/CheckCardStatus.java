package ra.card;

import ra.util.tasks.BaseTask;
import ra.util.tasks.TaskRunner;

class CheckCardStatus extends BaseTask {

    private CardService service;

    public CheckCardStatus(CardService service, TaskRunner taskRunner) {
        super(CheckCardStatus.class.getSimpleName(), taskRunner);
        this.service = service;
    }

    @Override
    public Boolean execute() {
        service.checkNFCStatus();
        return true;
    }
}

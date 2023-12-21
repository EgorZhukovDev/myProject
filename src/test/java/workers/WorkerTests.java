package workers;

import mocks.workers.TooLowSalaryException;
import mocks.workers.Worker;
import mocks.workers.WorkerRepository;
import mocks.workers.WorkerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class WorkerTests {

    @InjectMocks
    private WorkerService workerService;
    @Mock
    private WorkerRepository workerRepository;

    @Test
    void sumOfSalaries (){
        Worker worker1 = new Worker(1, "Дмитрий", 100_000);
        Worker worker2 = new Worker(2, "Loki", 150_000);
        Mockito.when(workerRepository.findAll()).thenReturn(List.of(worker1, worker2));

        int sumOfSalariesOfAllWorkers = workerService.getSumOfSalariesOfAllWorkers();
        Assertions.assertEquals(250000, sumOfSalariesOfAllWorkers);
    }

    @Test
    void checkLowSalary_trowsException () {
        Worker worker = new Worker(1, "Max", 15_242);
        Assertions.assertThrows(TooLowSalaryException.class, () -> workerService.hireWorker(worker));
    }

    @Test
    void checkHighSalary_savesWorker () {
        Worker worker = new Worker(1, "Ivan", 18_242);
        workerService.hireWorker(worker);
        Mockito.verify(workerRepository, Mockito.times(1)).save(worker);
    }
}

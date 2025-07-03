import com.tracker.budgetee.model.Transaction;
import com.tracker.budgetee.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping
    public String listTransactions(Model model) {
        model.addAttribute("transactions", service.getAllTransactions());
        model.addAttribute("transaction", new Transaction());
        return "transactions";
    }

    @PostMapping
    public String addTransaction(@ModelAttribute Transaction transaction) {
        service.saveTransaction(transaction);
        return "redirect:/transactions";
    }
}

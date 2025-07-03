// services/transactionService.ts
export const fetchTransactions = async () => {
    const response = await fetch('/transactions');
    return response.json();
};

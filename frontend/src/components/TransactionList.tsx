import React, { useEffect, useState } from 'react';

interface Transaction {
  id: number;
  description: string;
  amount: number;
  date: string;
  category: string;
}

const TransactionList: React.FC = () => {
  const [transactions, setTransactions] = useState<Transaction[]>([]);

  useEffect(() => {
    fetch('/transactions')
      .then(res => res.json())
      .then(data => setTransactions(data));
  }, []);

  return (
    <ul>
      {transactions.map((txn) => (
        <li key={txn.id}>
          {txn.description} - {txn.amount} - {txn.date} - {txn.category}
        </li>
      ))}
    </ul>
  );
};

export default TransactionList;

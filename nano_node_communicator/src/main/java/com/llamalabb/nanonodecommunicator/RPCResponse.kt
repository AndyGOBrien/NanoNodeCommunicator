package com.llamalabb.nanonodecommunicator

/**
 * Created by andy on 3/28/18.
 */

data class RawAccountBalance(
        val balance: String,
        val pending: String
)
data class History(
        val hash: String,
        val type: String,
        val account: String,
        val amount: String
)
data class AccountInformation(
        val frontier: String,
        val openBlock: String,
        val representativeBlock: String,
        val balance: String,
        val modifiedTimeStamp: String,
        val representative: String,
        val weight: String,
        val Pending: String
)
data class Ledger(
        val frontier: String,
        val openBlock: String,
        val representativeBlock: String,
        val balance: String,
        val modifiedTimeStamp: String,
        val blockCount: String,
        val representative: String,
        val weight: String,
        val Pending: String
)
data class Block(
        val type: String,
        val account: String,
        val representative: String,
        val source: String,
        val work: String,
        val signature: String
)
data class BlockWithInfo(
        val blockAccount: String,
        val amount: String,
        val contents: Block,
        val pending: String,
        val sourceAccount: String
)
data class BlockCount(
        val count: String,
        val unchecked: String
)
data class BlockCountType(
        val send: String,
        val receive: String,
        val open: String,
        val change: String
)
data class Key(
        val private: String,
        val public: String,
        val account: String
)
data class Version(
        val rpcVersion: String,
        val storeVersion: String,
        val nodeVendor: String
)
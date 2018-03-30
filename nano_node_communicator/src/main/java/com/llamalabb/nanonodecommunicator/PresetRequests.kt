package com.llamalabb.nanonodecommunicator

object PresetRequests : NodeRPCInterface {
    override fun accountBalance(account: String): RawAccountBalance {
        val request = RpcRequest("account_balance")
                .addParam("account", account)
                .create()
        return RawAccountBalance("temp", "temp")
    }

    override fun accountBlockCount(account: String): String {
        val request = RpcRequest("account_block_count")
                .addParam("account", account)
                .create()
        return "temp"
    }

    override fun accountGet(key: String): String {
        val request = RpcRequest("account_get")
                .addParam("key", key)
                .create()
        return "temp"
    }

    override fun AccountHistory(account: String, count: Int): List<History> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountInfo(account: String): AccountInformation {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountKey(account: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountRepresentative(account: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountWeight(account: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountsBalances(accounts: List<String>): HashMap<String, RawAccountBalance> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountsFrontiers(accounts: List<String>): HashMap<String, String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AccountsPending(accounts: List<String>): HashMap<String, List<String>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun AvailableSupply(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Block(hash: String): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Blocks(hashes: List<String>): HashMap<String, Block> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun BlocksInfo(hashes: List<String>): HashMap<String, BlockWithInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun BlockAccount(hash: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun BlockCount(): BlockCount {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun BlockCountType(): BlockCountType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun BlockCreate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Chain(block: String, count: Int): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Delegators(account: String): HashMap<String, String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun DelegatorsCount(account: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun DeterminsticKey(seed: String, index: Int): Key {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Frontiers(account: String, count: Int): HashMap<String, String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun FrontierCount(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun History(hash: String, count: Int): History {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun KeyCreate(): Key {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun KeyExpand(key: String): Key {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun KRaiToRaw(amount: Long): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun KRaiFromRaw(amount: Long): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Ledger(account: String, count: Int): Ledger {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun MRaiToRaw(amount: Long): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun MRaiFromRaw(amount: Long): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ReceiveMinimum(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Representatives(): HashMap<String, String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Successors(block: String, count: Int): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Unchecked(count: Int): HashMap<String, Block> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun UncheckedGet(hash: String): Block {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ValidateAccountNumber(account: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun Version(): Version {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun WorkGenerate(hash: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun WorkValidate(work: String, hash: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
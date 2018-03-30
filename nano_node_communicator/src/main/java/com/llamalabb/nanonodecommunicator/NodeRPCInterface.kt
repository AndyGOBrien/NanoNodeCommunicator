package com.llamalabb.nanonodecommunicator

/**
 * Created by andy on 3/28/18.
 */
interface NodeRPCInterface {

    fun AccountBalance(account: String) : RawAccountBalance
    fun AccountBlockCount(account: String) : String
    fun AccountGet(key: String) : String
    fun AccountHistory(account: String, count: Int) : List<History>
    fun AccountInfo(account: String) : AccountInformation
    fun AccountKey(account: String) : String
    fun AccountRepresentative(account: String) : String
    fun AccountWeight(account: String) : String
    fun AccountsBalances(accounts: List<String>) : HashMap<String, RawAccountBalance>
    fun AccountsFrontiers(accounts: List<String>) : HashMap<String, String>
    fun AccountsPending(accounts: List<String>) : HashMap<String, List<String>>
    fun AvailableSupply() : String
    fun Block(hash: String) : Block
    fun Blocks(hashes: List<String>): HashMap<String, Block>
    fun BlocksInfo(hashes: List<String>) : HashMap<String, BlockWithInfo>
    fun BlockAccount(hash: String): String
    fun BlockCount() : BlockCount
    fun BlockCountType() : BlockCountType
    fun BlockCreate() //TODO: Implement different block types
    fun Chain(block: String, count: Int) : List<String>
    fun Delegators(account: String) : HashMap<String, String>
    fun DelegatorsCount(account: String) : String
    fun DeterminsticKey(seed: String, index: Int): Key
    fun Frontiers(account: String, count: Int): HashMap<String, String>
    fun FrontierCount() : String
    fun History(hash: String, count: Int) : History
    fun KeyCreate() : Key
    fun KeyExpand(key: String) : Key
    fun KRaiToRaw(amount: Long) : String
    fun KRaiFromRaw(amount: Long) : String
    fun Ledger(account: String, count: Int) : Ledger
    fun MRaiToRaw(amount: Long) : String
    fun MRaiFromRaw(amount: Long) : String
    fun ReceiveMinimum() : String
    fun Representatives() : HashMap<String, String>
    fun Successors(block: String, count: Int) : List<String>
    fun Unchecked(count: Int) : HashMap<String, Block>
    fun UncheckedGet(hash: String) : Block
    fun ValidateAccountNumber(account: String) : String
    fun Version() : Version
    fun WorkGenerate(hash: String) : String
    fun WorkValidate(work: String, hash: String) : String

}
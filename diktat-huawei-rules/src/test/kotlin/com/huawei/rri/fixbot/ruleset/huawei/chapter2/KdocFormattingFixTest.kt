package com.huawei.rri.fixbot.ruleset.huawei.chapter2

import com.huawei.rri.fixbot.ruleset.huawei.rules.KdocFormatting
import com.huawei.rri.fixbot.ruleset.huawei.utils.FixTestBase
import org.junit.Test

class KdocFormattingFixTest: FixTestBase("test/paragraph2/kdoc/", KdocFormatting()) {

    @Test
    fun `there should be no blank line between kdoc and it's declaration code`() {
        fixAndCompare("KdocEmptyLineExpected.kt", "KdocEmptyLineTest.kt")
    }

    @Test
    fun `there should be exactly one white space after tag name`() {
        fixAndCompare("SpacesAfterTagExpected.kt", "SpacesAfterTagTest.kt")
    }

    @Test
    fun `tags should be ordered in KDocs`() {
        fixAndCompare("OrderedTagsExpected.kt", "OrderedTagsTest.kt")
    }

    @Test
    fun `special tags should have newline after them`() {
        fixAndCompare("SpecialTagsInKdocExpected.kt", "SpecialTagsInKdocTest.kt")
    }
}

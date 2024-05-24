// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.inputs.GetIpsetArgs;
import com.pulumi.aws.wafregional.inputs.GetIpsetPlainArgs;
import com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs;
import com.pulumi.aws.wafregional.inputs.GetRateBasedModPlainArgs;
import com.pulumi.aws.wafregional.inputs.GetRuleArgs;
import com.pulumi.aws.wafregional.inputs.GetRulePlainArgs;
import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupPlainArgs;
import com.pulumi.aws.wafregional.inputs.GetWebAclArgs;
import com.pulumi.aws.wafregional.inputs.GetWebAclPlainArgs;
import com.pulumi.aws.wafregional.outputs.GetIpsetResult;
import com.pulumi.aws.wafregional.outputs.GetRateBasedModResult;
import com.pulumi.aws.wafregional.outputs.GetRuleResult;
import com.pulumi.aws.wafregional.outputs.GetSubscribedRuleGroupResult;
import com.pulumi.aws.wafregional.outputs.GetWebAclResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WafregionalFunctions {
    /**
     * `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetIpsetArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getIpset(GetIpsetArgs.builder()
     *             .name("tfWAFRegionalIPSet")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetIpsetResult> getIpset(GetIpsetArgs args) {
        return getIpset(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetIpsetArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getIpset(GetIpsetArgs.builder()
     *             .name("tfWAFRegionalIPSet")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetIpsetResult> getIpsetPlain(GetIpsetPlainArgs args) {
        return getIpsetPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetIpsetArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getIpset(GetIpsetArgs.builder()
     *             .name("tfWAFRegionalIPSet")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetIpsetResult> getIpset(GetIpsetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:wafregional/getIpset:getIpset", TypeShape.of(GetIpsetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetIpsetArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getIpset(GetIpsetArgs.builder()
     *             .name("tfWAFRegionalIPSet")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetIpsetResult> getIpsetPlain(GetIpsetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafregional/getIpset:getIpset", TypeShape.of(GetIpsetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRateBasedMod(GetRateBasedModArgs.builder()
     *             .name("tfWAFRegionalRateBasedRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRateBasedModResult> getRateBasedMod(GetRateBasedModArgs args) {
        return getRateBasedMod(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRateBasedMod(GetRateBasedModArgs.builder()
     *             .name("tfWAFRegionalRateBasedRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRateBasedModResult> getRateBasedModPlain(GetRateBasedModPlainArgs args) {
        return getRateBasedModPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRateBasedMod(GetRateBasedModArgs.builder()
     *             .name("tfWAFRegionalRateBasedRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRateBasedModResult> getRateBasedMod(GetRateBasedModArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:wafregional/getRateBasedMod:getRateBasedMod", TypeShape.of(GetRateBasedModResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRateBasedMod(GetRateBasedModArgs.builder()
     *             .name("tfWAFRegionalRateBasedRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRateBasedModResult> getRateBasedModPlain(GetRateBasedModPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafregional/getRateBasedMod:getRateBasedMod", TypeShape.of(GetRateBasedModResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRule(GetRuleArgs.builder()
     *             .name("tfWAFRegionalRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args) {
        return getRule(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRule(GetRuleArgs.builder()
     *             .name("tfWAFRegionalRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain(GetRulePlainArgs args) {
        return getRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRule(GetRuleArgs.builder()
     *             .name("tfWAFRegionalRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleResult> getRule(GetRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:wafregional/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getRule(GetRuleArgs.builder()
     *             .name("tfWAFRegionalRule")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleResult> getRulePlain(GetRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafregional/getRule:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first).
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.wafregional.WebAcl;
     * import com.pulumi.aws.wafregional.WebAclArgs;
     * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name("F5 Bot Detection Signatures For AWS WAF")
     *             .build());
     * 
     *         final var byMetricName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName("F5BotDetectionSignatures")
     *             .build());
     * 
     *         var acl = new WebAcl("acl", WebAclArgs.builder()
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSubscribedRuleGroupResult> getSubscribedRuleGroup() {
        return getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first).
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.wafregional.WebAcl;
     * import com.pulumi.aws.wafregional.WebAclArgs;
     * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name("F5 Bot Detection Signatures For AWS WAF")
     *             .build());
     * 
     *         final var byMetricName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName("F5BotDetectionSignatures")
     *             .build());
     * 
     *         var acl = new WebAcl("acl", WebAclArgs.builder()
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSubscribedRuleGroupResult> getSubscribedRuleGroupPlain() {
        return getSubscribedRuleGroupPlain(GetSubscribedRuleGroupPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first).
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.wafregional.WebAcl;
     * import com.pulumi.aws.wafregional.WebAclArgs;
     * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name("F5 Bot Detection Signatures For AWS WAF")
     *             .build());
     * 
     *         final var byMetricName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName("F5BotDetectionSignatures")
     *             .build());
     * 
     *         var acl = new WebAcl("acl", WebAclArgs.builder()
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSubscribedRuleGroupResult> getSubscribedRuleGroup(GetSubscribedRuleGroupArgs args) {
        return getSubscribedRuleGroup(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first).
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.wafregional.WebAcl;
     * import com.pulumi.aws.wafregional.WebAclArgs;
     * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name("F5 Bot Detection Signatures For AWS WAF")
     *             .build());
     * 
     *         final var byMetricName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName("F5BotDetectionSignatures")
     *             .build());
     * 
     *         var acl = new WebAcl("acl", WebAclArgs.builder()
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSubscribedRuleGroupResult> getSubscribedRuleGroupPlain(GetSubscribedRuleGroupPlainArgs args) {
        return getSubscribedRuleGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first).
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.wafregional.WebAcl;
     * import com.pulumi.aws.wafregional.WebAclArgs;
     * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name("F5 Bot Detection Signatures For AWS WAF")
     *             .build());
     * 
     *         final var byMetricName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName("F5BotDetectionSignatures")
     *             .build());
     * 
     *         var acl = new WebAcl("acl", WebAclArgs.builder()
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSubscribedRuleGroupResult> getSubscribedRuleGroup(GetSubscribedRuleGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:wafregional/getSubscribedRuleGroup:getSubscribedRuleGroup", TypeShape.of(GetSubscribedRuleGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first).
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs;
     * import com.pulumi.aws.wafregional.WebAcl;
     * import com.pulumi.aws.wafregional.WebAclArgs;
     * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var byName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .name("F5 Bot Detection Signatures For AWS WAF")
     *             .build());
     * 
     *         final var byMetricName = WafregionalFunctions.getSubscribedRuleGroup(GetSubscribedRuleGroupArgs.builder()
     *             .metricName("F5BotDetectionSignatures")
     *             .build());
     * 
     *         var acl = new WebAcl("acl", WebAclArgs.builder()
     *             .rules(            
     *                 WebAclRuleArgs.builder()
     *                     .priority(1)
     *                     .ruleId(byName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build(),
     *                 WebAclRuleArgs.builder()
     *                     .priority(2)
     *                     .ruleId(byMetricName.applyValue(getSubscribedRuleGroupResult -> getSubscribedRuleGroupResult.id()))
     *                     .type("GROUP")
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSubscribedRuleGroupResult> getSubscribedRuleGroupPlain(GetSubscribedRuleGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafregional/getSubscribedRuleGroup:getSubscribedRuleGroup", TypeShape.of(GetSubscribedRuleGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.WebAcl` Retrieves a WAF Regional Web ACL Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetWebAclArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name("tfWAFRegionalWebACL")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetWebAclResult> getWebAcl(GetWebAclArgs args) {
        return getWebAcl(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.WebAcl` Retrieves a WAF Regional Web ACL Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetWebAclArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name("tfWAFRegionalWebACL")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetWebAclResult> getWebAclPlain(GetWebAclPlainArgs args) {
        return getWebAclPlain(args, InvokeOptions.Empty);
    }
    /**
     * `aws.wafregional.WebAcl` Retrieves a WAF Regional Web ACL Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetWebAclArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name("tfWAFRegionalWebACL")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetWebAclResult> getWebAcl(GetWebAclArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:wafregional/getWebAcl:getWebAcl", TypeShape.of(GetWebAclResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.wafregional.WebAcl` Retrieves a WAF Regional Web ACL Resource Id.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.wafregional.WafregionalFunctions;
     * import com.pulumi.aws.wafregional.inputs.GetWebAclArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = WafregionalFunctions.getWebAcl(GetWebAclArgs.builder()
     *             .name("tfWAFRegionalWebACL")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetWebAclResult> getWebAclPlain(GetWebAclPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafregional/getWebAcl:getWebAcl", TypeShape.of(GetWebAclResult.class), args, Utilities.withVersion(options));
    }
}

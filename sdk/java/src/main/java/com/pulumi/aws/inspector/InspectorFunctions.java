// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.inspector.outputs.GetRulesPackagesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class InspectorFunctions {
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.inspector.InspectorFunctions;
     * import com.pulumi.aws.inspector.ResourceGroup;
     * import com.pulumi.aws.inspector.ResourceGroupArgs;
     * import com.pulumi.aws.inspector.AssessmentTarget;
     * import com.pulumi.aws.inspector.AssessmentTargetArgs;
     * import com.pulumi.aws.inspector.AssessmentTemplate;
     * import com.pulumi.aws.inspector.AssessmentTemplateArgs;
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
     *         final var rules = InspectorFunctions.getRulesPackages();
     * 
     *         var group = new ResourceGroup(&#34;group&#34;, ResourceGroupArgs.builder()        
     *             .tags(Map.of(&#34;test&#34;, &#34;test&#34;))
     *             .build());
     * 
     *         var assessment = new AssessmentTarget(&#34;assessment&#34;, AssessmentTargetArgs.builder()        
     *             .name(&#34;test&#34;)
     *             .resourceGroupArn(group.arn())
     *             .build());
     * 
     *         var assessmentAssessmentTemplate = new AssessmentTemplate(&#34;assessmentAssessmentTemplate&#34;, AssessmentTemplateArgs.builder()        
     *             .name(&#34;Test&#34;)
     *             .targetArn(assessment.arn())
     *             .duration(&#34;60&#34;)
     *             .rulesPackageArns(rules.applyValue(getRulesPackagesResult -&gt; getRulesPackagesResult.arns()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRulesPackagesResult> getRulesPackages() {
        return getRulesPackages(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.inspector.InspectorFunctions;
     * import com.pulumi.aws.inspector.ResourceGroup;
     * import com.pulumi.aws.inspector.ResourceGroupArgs;
     * import com.pulumi.aws.inspector.AssessmentTarget;
     * import com.pulumi.aws.inspector.AssessmentTargetArgs;
     * import com.pulumi.aws.inspector.AssessmentTemplate;
     * import com.pulumi.aws.inspector.AssessmentTemplateArgs;
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
     *         final var rules = InspectorFunctions.getRulesPackages();
     * 
     *         var group = new ResourceGroup(&#34;group&#34;, ResourceGroupArgs.builder()        
     *             .tags(Map.of(&#34;test&#34;, &#34;test&#34;))
     *             .build());
     * 
     *         var assessment = new AssessmentTarget(&#34;assessment&#34;, AssessmentTargetArgs.builder()        
     *             .name(&#34;test&#34;)
     *             .resourceGroupArn(group.arn())
     *             .build());
     * 
     *         var assessmentAssessmentTemplate = new AssessmentTemplate(&#34;assessmentAssessmentTemplate&#34;, AssessmentTemplateArgs.builder()        
     *             .name(&#34;Test&#34;)
     *             .targetArn(assessment.arn())
     *             .duration(&#34;60&#34;)
     *             .rulesPackageArns(rules.applyValue(getRulesPackagesResult -&gt; getRulesPackagesResult.arns()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRulesPackagesResult> getRulesPackagesPlain() {
        return getRulesPackagesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.inspector.InspectorFunctions;
     * import com.pulumi.aws.inspector.ResourceGroup;
     * import com.pulumi.aws.inspector.ResourceGroupArgs;
     * import com.pulumi.aws.inspector.AssessmentTarget;
     * import com.pulumi.aws.inspector.AssessmentTargetArgs;
     * import com.pulumi.aws.inspector.AssessmentTemplate;
     * import com.pulumi.aws.inspector.AssessmentTemplateArgs;
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
     *         final var rules = InspectorFunctions.getRulesPackages();
     * 
     *         var group = new ResourceGroup(&#34;group&#34;, ResourceGroupArgs.builder()        
     *             .tags(Map.of(&#34;test&#34;, &#34;test&#34;))
     *             .build());
     * 
     *         var assessment = new AssessmentTarget(&#34;assessment&#34;, AssessmentTargetArgs.builder()        
     *             .name(&#34;test&#34;)
     *             .resourceGroupArn(group.arn())
     *             .build());
     * 
     *         var assessmentAssessmentTemplate = new AssessmentTemplate(&#34;assessmentAssessmentTemplate&#34;, AssessmentTemplateArgs.builder()        
     *             .name(&#34;Test&#34;)
     *             .targetArn(assessment.arn())
     *             .duration(&#34;60&#34;)
     *             .rulesPackageArns(rules.applyValue(getRulesPackagesResult -&gt; getRulesPackagesResult.arns()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRulesPackagesResult> getRulesPackages(InvokeArgs args) {
        return getRulesPackages(args, InvokeOptions.Empty);
    }
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.inspector.InspectorFunctions;
     * import com.pulumi.aws.inspector.ResourceGroup;
     * import com.pulumi.aws.inspector.ResourceGroupArgs;
     * import com.pulumi.aws.inspector.AssessmentTarget;
     * import com.pulumi.aws.inspector.AssessmentTargetArgs;
     * import com.pulumi.aws.inspector.AssessmentTemplate;
     * import com.pulumi.aws.inspector.AssessmentTemplateArgs;
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
     *         final var rules = InspectorFunctions.getRulesPackages();
     * 
     *         var group = new ResourceGroup(&#34;group&#34;, ResourceGroupArgs.builder()        
     *             .tags(Map.of(&#34;test&#34;, &#34;test&#34;))
     *             .build());
     * 
     *         var assessment = new AssessmentTarget(&#34;assessment&#34;, AssessmentTargetArgs.builder()        
     *             .name(&#34;test&#34;)
     *             .resourceGroupArn(group.arn())
     *             .build());
     * 
     *         var assessmentAssessmentTemplate = new AssessmentTemplate(&#34;assessmentAssessmentTemplate&#34;, AssessmentTemplateArgs.builder()        
     *             .name(&#34;Test&#34;)
     *             .targetArn(assessment.arn())
     *             .duration(&#34;60&#34;)
     *             .rulesPackageArns(rules.applyValue(getRulesPackagesResult -&gt; getRulesPackagesResult.arns()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRulesPackagesResult> getRulesPackagesPlain(InvokeArgs args) {
        return getRulesPackagesPlain(args, InvokeOptions.Empty);
    }
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.inspector.InspectorFunctions;
     * import com.pulumi.aws.inspector.ResourceGroup;
     * import com.pulumi.aws.inspector.ResourceGroupArgs;
     * import com.pulumi.aws.inspector.AssessmentTarget;
     * import com.pulumi.aws.inspector.AssessmentTargetArgs;
     * import com.pulumi.aws.inspector.AssessmentTemplate;
     * import com.pulumi.aws.inspector.AssessmentTemplateArgs;
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
     *         final var rules = InspectorFunctions.getRulesPackages();
     * 
     *         var group = new ResourceGroup(&#34;group&#34;, ResourceGroupArgs.builder()        
     *             .tags(Map.of(&#34;test&#34;, &#34;test&#34;))
     *             .build());
     * 
     *         var assessment = new AssessmentTarget(&#34;assessment&#34;, AssessmentTargetArgs.builder()        
     *             .name(&#34;test&#34;)
     *             .resourceGroupArn(group.arn())
     *             .build());
     * 
     *         var assessmentAssessmentTemplate = new AssessmentTemplate(&#34;assessmentAssessmentTemplate&#34;, AssessmentTemplateArgs.builder()        
     *             .name(&#34;Test&#34;)
     *             .targetArn(assessment.arn())
     *             .duration(&#34;60&#34;)
     *             .rulesPackageArns(rules.applyValue(getRulesPackagesResult -&gt; getRulesPackagesResult.arns()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRulesPackagesResult> getRulesPackages(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:inspector/getRulesPackages:getRulesPackages", TypeShape.of(GetRulesPackagesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
     * Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
     * configured in the provider.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.inspector.InspectorFunctions;
     * import com.pulumi.aws.inspector.ResourceGroup;
     * import com.pulumi.aws.inspector.ResourceGroupArgs;
     * import com.pulumi.aws.inspector.AssessmentTarget;
     * import com.pulumi.aws.inspector.AssessmentTargetArgs;
     * import com.pulumi.aws.inspector.AssessmentTemplate;
     * import com.pulumi.aws.inspector.AssessmentTemplateArgs;
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
     *         final var rules = InspectorFunctions.getRulesPackages();
     * 
     *         var group = new ResourceGroup(&#34;group&#34;, ResourceGroupArgs.builder()        
     *             .tags(Map.of(&#34;test&#34;, &#34;test&#34;))
     *             .build());
     * 
     *         var assessment = new AssessmentTarget(&#34;assessment&#34;, AssessmentTargetArgs.builder()        
     *             .name(&#34;test&#34;)
     *             .resourceGroupArn(group.arn())
     *             .build());
     * 
     *         var assessmentAssessmentTemplate = new AssessmentTemplate(&#34;assessmentAssessmentTemplate&#34;, AssessmentTemplateArgs.builder()        
     *             .name(&#34;Test&#34;)
     *             .targetArn(assessment.arn())
     *             .duration(&#34;60&#34;)
     *             .rulesPackageArns(rules.applyValue(getRulesPackagesResult -&gt; getRulesPackagesResult.arns()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRulesPackagesResult> getRulesPackagesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:inspector/getRulesPackages:getRulesPackages", TypeShape.of(GetRulesPackagesResult.class), args, Utilities.withVersion(options));
    }
}

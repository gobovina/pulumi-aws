// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.inputs.GetEndpointArgs;
import com.pulumi.aws.iot.inputs.GetEndpointPlainArgs;
import com.pulumi.aws.iot.outputs.GetEndpointResult;
import com.pulumi.aws.iot.outputs.GetRegistrationCodeResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class IotFunctions {
    /**
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.aws.iot.inputs.GetEndpointArgs;
     * import com.pulumi.kubernetes.core_v1.Pod;
     * import com.pulumi.kubernetes.core_v1.PodArgs;
     * import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
     * import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
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
     *         final var example = IotFunctions.getEndpoint();
     * 
     *         var agent = new Pod("agent", PodArgs.builder()
     *             .metadata(ObjectMetaArgs.builder()
     *                 .name("my-device")
     *                 .build())
     *             .spec(PodSpecArgs.builder()
     *                 .container(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEndpointResult> getEndpoint() {
        return getEndpoint(GetEndpointArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.aws.iot.inputs.GetEndpointArgs;
     * import com.pulumi.kubernetes.core_v1.Pod;
     * import com.pulumi.kubernetes.core_v1.PodArgs;
     * import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
     * import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
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
     *         final var example = IotFunctions.getEndpoint();
     * 
     *         var agent = new Pod("agent", PodArgs.builder()
     *             .metadata(ObjectMetaArgs.builder()
     *                 .name("my-device")
     *                 .build())
     *             .spec(PodSpecArgs.builder()
     *                 .container(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain() {
        return getEndpointPlain(GetEndpointPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.aws.iot.inputs.GetEndpointArgs;
     * import com.pulumi.kubernetes.core_v1.Pod;
     * import com.pulumi.kubernetes.core_v1.PodArgs;
     * import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
     * import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
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
     *         final var example = IotFunctions.getEndpoint();
     * 
     *         var agent = new Pod("agent", PodArgs.builder()
     *             .metadata(ObjectMetaArgs.builder()
     *                 .name("my-device")
     *                 .build())
     *             .spec(PodSpecArgs.builder()
     *                 .container(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args) {
        return getEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.aws.iot.inputs.GetEndpointArgs;
     * import com.pulumi.kubernetes.core_v1.Pod;
     * import com.pulumi.kubernetes.core_v1.PodArgs;
     * import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
     * import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
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
     *         final var example = IotFunctions.getEndpoint();
     * 
     *         var agent = new Pod("agent", PodArgs.builder()
     *             .metadata(ObjectMetaArgs.builder()
     *                 .name("my-device")
     *                 .build())
     *             .spec(PodSpecArgs.builder()
     *                 .container(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args) {
        return getEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.aws.iot.inputs.GetEndpointArgs;
     * import com.pulumi.kubernetes.core_v1.Pod;
     * import com.pulumi.kubernetes.core_v1.PodArgs;
     * import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
     * import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
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
     *         final var example = IotFunctions.getEndpoint();
     * 
     *         var agent = new Pod("agent", PodArgs.builder()
     *             .metadata(ObjectMetaArgs.builder()
     *                 .name("my-device")
     *                 .build())
     *             .spec(PodSpecArgs.builder()
     *                 .container(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:iot/getEndpoint:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a unique endpoint specific to the AWS account making the call.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.aws.iot.inputs.GetEndpointArgs;
     * import com.pulumi.kubernetes.core_v1.Pod;
     * import com.pulumi.kubernetes.core_v1.PodArgs;
     * import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
     * import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
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
     *         final var example = IotFunctions.getEndpoint();
     * 
     *         var agent = new Pod("agent", PodArgs.builder()
     *             .metadata(ObjectMetaArgs.builder()
     *                 .name("my-device")
     *                 .build())
     *             .spec(PodSpecArgs.builder()
     *                 .container(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:iot/getEndpoint:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.tls.PrivateKey;
     * import com.pulumi.tls.PrivateKeyArgs;
     * import com.pulumi.tls.CertRequest;
     * import com.pulumi.tls.CertRequestArgs;
     * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
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
     *         final var example = IotFunctions.getRegistrationCode();
     * 
     *         var verification = new PrivateKey("verification", PrivateKeyArgs.builder()
     *             .algorithm("RSA")
     *             .build());
     * 
     *         var verificationCertRequest = new CertRequest("verificationCertRequest", CertRequestArgs.builder()
     *             .keyAlgorithm("RSA")
     *             .privateKeyPem(verification.privateKeyPem())
     *             .subject(CertRequestSubjectArgs.builder()
     *                 .commonName(example.applyValue(getRegistrationCodeResult -> getRegistrationCodeResult.registrationCode()))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRegistrationCodeResult> getRegistrationCode() {
        return getRegistrationCode(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.tls.PrivateKey;
     * import com.pulumi.tls.PrivateKeyArgs;
     * import com.pulumi.tls.CertRequest;
     * import com.pulumi.tls.CertRequestArgs;
     * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
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
     *         final var example = IotFunctions.getRegistrationCode();
     * 
     *         var verification = new PrivateKey("verification", PrivateKeyArgs.builder()
     *             .algorithm("RSA")
     *             .build());
     * 
     *         var verificationCertRequest = new CertRequest("verificationCertRequest", CertRequestArgs.builder()
     *             .keyAlgorithm("RSA")
     *             .privateKeyPem(verification.privateKeyPem())
     *             .subject(CertRequestSubjectArgs.builder()
     *                 .commonName(example.applyValue(getRegistrationCodeResult -> getRegistrationCodeResult.registrationCode()))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRegistrationCodeResult> getRegistrationCodePlain() {
        return getRegistrationCodePlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.tls.PrivateKey;
     * import com.pulumi.tls.PrivateKeyArgs;
     * import com.pulumi.tls.CertRequest;
     * import com.pulumi.tls.CertRequestArgs;
     * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
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
     *         final var example = IotFunctions.getRegistrationCode();
     * 
     *         var verification = new PrivateKey("verification", PrivateKeyArgs.builder()
     *             .algorithm("RSA")
     *             .build());
     * 
     *         var verificationCertRequest = new CertRequest("verificationCertRequest", CertRequestArgs.builder()
     *             .keyAlgorithm("RSA")
     *             .privateKeyPem(verification.privateKeyPem())
     *             .subject(CertRequestSubjectArgs.builder()
     *                 .commonName(example.applyValue(getRegistrationCodeResult -> getRegistrationCodeResult.registrationCode()))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRegistrationCodeResult> getRegistrationCode(InvokeArgs args) {
        return getRegistrationCode(args, InvokeOptions.Empty);
    }
    /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.tls.PrivateKey;
     * import com.pulumi.tls.PrivateKeyArgs;
     * import com.pulumi.tls.CertRequest;
     * import com.pulumi.tls.CertRequestArgs;
     * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
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
     *         final var example = IotFunctions.getRegistrationCode();
     * 
     *         var verification = new PrivateKey("verification", PrivateKeyArgs.builder()
     *             .algorithm("RSA")
     *             .build());
     * 
     *         var verificationCertRequest = new CertRequest("verificationCertRequest", CertRequestArgs.builder()
     *             .keyAlgorithm("RSA")
     *             .privateKeyPem(verification.privateKeyPem())
     *             .subject(CertRequestSubjectArgs.builder()
     *                 .commonName(example.applyValue(getRegistrationCodeResult -> getRegistrationCodeResult.registrationCode()))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRegistrationCodeResult> getRegistrationCodePlain(InvokeArgs args) {
        return getRegistrationCodePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.tls.PrivateKey;
     * import com.pulumi.tls.PrivateKeyArgs;
     * import com.pulumi.tls.CertRequest;
     * import com.pulumi.tls.CertRequestArgs;
     * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
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
     *         final var example = IotFunctions.getRegistrationCode();
     * 
     *         var verification = new PrivateKey("verification", PrivateKeyArgs.builder()
     *             .algorithm("RSA")
     *             .build());
     * 
     *         var verificationCertRequest = new CertRequest("verificationCertRequest", CertRequestArgs.builder()
     *             .keyAlgorithm("RSA")
     *             .privateKeyPem(verification.privateKeyPem())
     *             .subject(CertRequestSubjectArgs.builder()
     *                 .commonName(example.applyValue(getRegistrationCodeResult -> getRegistrationCodeResult.registrationCode()))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRegistrationCodeResult> getRegistrationCode(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:iot/getRegistrationCode:getRegistrationCode", TypeShape.of(GetRegistrationCodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a registration code used to register a CA certificate with AWS IoT.
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
     * import com.pulumi.aws.iot.IotFunctions;
     * import com.pulumi.tls.PrivateKey;
     * import com.pulumi.tls.PrivateKeyArgs;
     * import com.pulumi.tls.CertRequest;
     * import com.pulumi.tls.CertRequestArgs;
     * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
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
     *         final var example = IotFunctions.getRegistrationCode();
     * 
     *         var verification = new PrivateKey("verification", PrivateKeyArgs.builder()
     *             .algorithm("RSA")
     *             .build());
     * 
     *         var verificationCertRequest = new CertRequest("verificationCertRequest", CertRequestArgs.builder()
     *             .keyAlgorithm("RSA")
     *             .privateKeyPem(verification.privateKeyPem())
     *             .subject(CertRequestSubjectArgs.builder()
     *                 .commonName(example.applyValue(getRegistrationCodeResult -> getRegistrationCodeResult.registrationCode()))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRegistrationCodeResult> getRegistrationCodePlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:iot/getRegistrationCode:getRegistrationCode", TypeShape.of(GetRegistrationCodeResult.class), args, Utilities.withVersion(options));
    }
}

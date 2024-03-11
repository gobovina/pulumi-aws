// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetInstanceType
    {
        /// <summary>
        /// Get characteristics for a single EC2 Instance Type.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ec2.GetInstanceType.Invoke(new()
        ///     {
        ///         InstanceType = "t2.micro",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetInstanceTypeResult> InvokeAsync(GetInstanceTypeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTypeResult>("aws:ec2/getInstanceType:getInstanceType", args ?? new GetInstanceTypeArgs(), options.WithDefaults());

        /// <summary>
        /// Get characteristics for a single EC2 Instance Type.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ec2.GetInstanceType.Invoke(new()
        ///     {
        ///         InstanceType = "t2.micro",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetInstanceTypeResult> Invoke(GetInstanceTypeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTypeResult>("aws:ec2/getInstanceType:getInstanceType", args ?? new GetInstanceTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Instance
        /// </summary>
        [Input("instanceType", required: true)]
        public string InstanceType { get; set; } = null!;

        public GetInstanceTypeArgs()
        {
        }
        public static new GetInstanceTypeArgs Empty => new GetInstanceTypeArgs();
    }

    public sealed class GetInstanceTypeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Instance
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        public GetInstanceTypeInvokeArgs()
        {
        }
        public static new GetInstanceTypeInvokeArgs Empty => new GetInstanceTypeInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceTypeResult
    {
        /// <summary>
        /// `true` if auto recovery is supported.
        /// </summary>
        public readonly bool AutoRecoverySupported;
        /// <summary>
        /// `true` if it is a bare metal instance type.
        /// </summary>
        public readonly bool BareMetal;
        /// <summary>
        /// `true` if the instance type is a burstable performance instance type.
        /// </summary>
        public readonly bool BurstablePerformanceSupported;
        /// <summary>
        /// `true`  if the instance type is a current generation.
        /// </summary>
        public readonly bool CurrentGeneration;
        /// <summary>
        /// `true` if Dedicated Hosts are supported on the instance type.
        /// </summary>
        public readonly bool DedicatedHostsSupported;
        /// <summary>
        /// Default number of cores for the instance type.
        /// </summary>
        public readonly int DefaultCores;
        /// <summary>
        /// The  default  number of threads per core for the instance type.
        /// </summary>
        public readonly int DefaultThreadsPerCore;
        /// <summary>
        /// Default number of vCPUs for the instance type.
        /// </summary>
        public readonly int DefaultVcpus;
        /// <summary>
        /// Indicates whether Amazon EBS encryption is supported.
        /// </summary>
        public readonly string EbsEncryptionSupport;
        /// <summary>
        /// Whether non-volatile memory express (NVMe) is supported.
        /// </summary>
        public readonly string EbsNvmeSupport;
        /// <summary>
        /// Indicates that the instance type is Amazon EBS-optimized.
        /// </summary>
        public readonly string EbsOptimizedSupport;
        /// <summary>
        /// The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
        /// </summary>
        public readonly int EbsPerformanceBaselineBandwidth;
        /// <summary>
        /// The baseline input/output storage operations per seconds for an EBS-optimized instance type.
        /// </summary>
        public readonly int EbsPerformanceBaselineIops;
        /// <summary>
        /// The baseline throughput performance for an EBS-optimized instance type, in MBps.
        /// </summary>
        public readonly double EbsPerformanceBaselineThroughput;
        /// <summary>
        /// The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
        /// </summary>
        public readonly int EbsPerformanceMaximumBandwidth;
        /// <summary>
        /// The maximum input/output storage operations per second for an EBS-optimized instance type.
        /// </summary>
        public readonly int EbsPerformanceMaximumIops;
        /// <summary>
        /// The maximum throughput performance for an EBS-optimized instance type, in MBps.
        /// </summary>
        public readonly double EbsPerformanceMaximumThroughput;
        /// <summary>
        /// Whether Elastic Fabric Adapter (EFA) is supported.
        /// </summary>
        public readonly bool EfaSupported;
        /// <summary>
        /// Whether Elastic Network Adapter (ENA) is supported.
        /// </summary>
        public readonly string EnaSupport;
        /// <summary>
        /// Indicates whether encryption in-transit between instances is supported.
        /// </summary>
        public readonly bool EncryptionInTransitSupported;
        /// <summary>
        /// Describes the FPGA accelerator settings for the instance type.
        /// * `fpgas.#.count` - The count of FPGA accelerators for the instance type.
        /// * `fpgas.#.manufacturer` - The manufacturer of the FPGA accelerator.
        /// * `fpgas.#.memory_size` - The size (in MiB) for the memory available to the FPGA accelerator.
        /// * `fpgas.#.name` - The name of the FPGA accelerator.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTypeFpgaResult> Fpgas;
        /// <summary>
        /// `true` if the instance type is eligible for the free tier.
        /// </summary>
        public readonly bool FreeTierEligible;
        /// <summary>
        /// Describes the GPU accelerators for the instance type.
        /// * `gpus.#.count` - The number of GPUs for the instance type.
        /// * `gpus.#.manufacturer` - The manufacturer of the GPU accelerator.
        /// * `gpus.#.memory_size` - The size (in MiB) for the memory available to the GPU accelerator.
        /// * `gpus.#.name` - The name of the GPU accelerator.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTypeGpusResult> Gpuses;
        /// <summary>
        /// `true` if On-Demand hibernation is supported.
        /// </summary>
        public readonly bool HibernationSupported;
        /// <summary>
        /// Hypervisor used for the instance type.
        /// </summary>
        public readonly string Hypervisor;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Describes the Inference accelerators for the instance type.
        /// * `inference_accelerators.#.count` - The number of Inference accelerators for the instance type.
        /// * `inference_accelerators.#.manufacturer` - The manufacturer of the Inference accelerator.
        /// * `inference_accelerators.#.name` - The name of the Inference accelerator.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTypeInferenceAcceleratorResult> InferenceAccelerators;
        /// <summary>
        /// Describes the disks for the instance type.
        /// * `instance_disks.#.count` - The number of disks with this configuration.
        /// * `instance_disks.#.size` - The size of the disk in GB.
        /// * `instance_disks.#.type` - The type of disk.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTypeInstanceDiskResult> InstanceDisks;
        /// <summary>
        /// `true` if instance storage is supported.
        /// </summary>
        public readonly bool InstanceStorageSupported;
        public readonly string InstanceType;
        /// <summary>
        /// `true` if IPv6 is supported.
        /// </summary>
        public readonly bool Ipv6Supported;
        /// <summary>
        /// The maximum number of IPv4 addresses per network interface.
        /// </summary>
        public readonly int MaximumIpv4AddressesPerInterface;
        /// <summary>
        /// The maximum number of IPv6 addresses per network interface.
        /// </summary>
        public readonly int MaximumIpv6AddressesPerInterface;
        /// <summary>
        /// The maximum number of physical network cards that can be allocated to the instance.
        /// </summary>
        public readonly int MaximumNetworkCards;
        /// <summary>
        /// The maximum number of network interfaces for the instance type.
        /// </summary>
        public readonly int MaximumNetworkInterfaces;
        /// <summary>
        /// Size of the instance memory, in MiB.
        /// </summary>
        public readonly int MemorySize;
        /// <summary>
        /// Describes the network performance.
        /// </summary>
        public readonly string NetworkPerformance;
        /// <summary>
        /// A list of architectures supported by the instance type.
        /// </summary>
        public readonly ImmutableArray<string> SupportedArchitectures;
        /// <summary>
        /// A list of supported placement groups types.
        /// </summary>
        public readonly ImmutableArray<string> SupportedPlacementStrategies;
        /// <summary>
        /// Indicates the supported root device types.
        /// </summary>
        public readonly ImmutableArray<string> SupportedRootDeviceTypes;
        /// <summary>
        /// Indicates whether the instance type is offered for spot or On-Demand.
        /// </summary>
        public readonly ImmutableArray<string> SupportedUsagesClasses;
        /// <summary>
        /// The supported virtualization types.
        /// </summary>
        public readonly ImmutableArray<string> SupportedVirtualizationTypes;
        /// <summary>
        /// The speed of the processor, in GHz.
        /// </summary>
        public readonly double SustainedClockSpeed;
        /// <summary>
        /// Total memory of all FPGA accelerators for the instance type (in MiB).
        /// </summary>
        public readonly int TotalFpgaMemory;
        /// <summary>
        /// Total size of the memory for the GPU accelerators for the instance type (in MiB).
        /// </summary>
        public readonly int TotalGpuMemory;
        /// <summary>
        /// The total size of the instance disks, in GB.
        /// </summary>
        public readonly int TotalInstanceStorage;
        /// <summary>
        /// List of the valid number of cores that can be configured for the instance type.
        /// </summary>
        public readonly ImmutableArray<int> ValidCores;
        /// <summary>
        /// List of the valid number of threads per core that can be configured for the instance type.
        /// </summary>
        public readonly ImmutableArray<int> ValidThreadsPerCores;

        [OutputConstructor]
        private GetInstanceTypeResult(
            bool autoRecoverySupported,

            bool bareMetal,

            bool burstablePerformanceSupported,

            bool currentGeneration,

            bool dedicatedHostsSupported,

            int defaultCores,

            int defaultThreadsPerCore,

            int defaultVcpus,

            string ebsEncryptionSupport,

            string ebsNvmeSupport,

            string ebsOptimizedSupport,

            int ebsPerformanceBaselineBandwidth,

            int ebsPerformanceBaselineIops,

            double ebsPerformanceBaselineThroughput,

            int ebsPerformanceMaximumBandwidth,

            int ebsPerformanceMaximumIops,

            double ebsPerformanceMaximumThroughput,

            bool efaSupported,

            string enaSupport,

            bool encryptionInTransitSupported,

            ImmutableArray<Outputs.GetInstanceTypeFpgaResult> fpgas,

            bool freeTierEligible,

            ImmutableArray<Outputs.GetInstanceTypeGpusResult> gpuses,

            bool hibernationSupported,

            string hypervisor,

            string id,

            ImmutableArray<Outputs.GetInstanceTypeInferenceAcceleratorResult> inferenceAccelerators,

            ImmutableArray<Outputs.GetInstanceTypeInstanceDiskResult> instanceDisks,

            bool instanceStorageSupported,

            string instanceType,

            bool ipv6Supported,

            int maximumIpv4AddressesPerInterface,

            int maximumIpv6AddressesPerInterface,

            int maximumNetworkCards,

            int maximumNetworkInterfaces,

            int memorySize,

            string networkPerformance,

            ImmutableArray<string> supportedArchitectures,

            ImmutableArray<string> supportedPlacementStrategies,

            ImmutableArray<string> supportedRootDeviceTypes,

            ImmutableArray<string> supportedUsagesClasses,

            ImmutableArray<string> supportedVirtualizationTypes,

            double sustainedClockSpeed,

            int totalFpgaMemory,

            int totalGpuMemory,

            int totalInstanceStorage,

            ImmutableArray<int> validCores,

            ImmutableArray<int> validThreadsPerCores)
        {
            AutoRecoverySupported = autoRecoverySupported;
            BareMetal = bareMetal;
            BurstablePerformanceSupported = burstablePerformanceSupported;
            CurrentGeneration = currentGeneration;
            DedicatedHostsSupported = dedicatedHostsSupported;
            DefaultCores = defaultCores;
            DefaultThreadsPerCore = defaultThreadsPerCore;
            DefaultVcpus = defaultVcpus;
            EbsEncryptionSupport = ebsEncryptionSupport;
            EbsNvmeSupport = ebsNvmeSupport;
            EbsOptimizedSupport = ebsOptimizedSupport;
            EbsPerformanceBaselineBandwidth = ebsPerformanceBaselineBandwidth;
            EbsPerformanceBaselineIops = ebsPerformanceBaselineIops;
            EbsPerformanceBaselineThroughput = ebsPerformanceBaselineThroughput;
            EbsPerformanceMaximumBandwidth = ebsPerformanceMaximumBandwidth;
            EbsPerformanceMaximumIops = ebsPerformanceMaximumIops;
            EbsPerformanceMaximumThroughput = ebsPerformanceMaximumThroughput;
            EfaSupported = efaSupported;
            EnaSupport = enaSupport;
            EncryptionInTransitSupported = encryptionInTransitSupported;
            Fpgas = fpgas;
            FreeTierEligible = freeTierEligible;
            Gpuses = gpuses;
            HibernationSupported = hibernationSupported;
            Hypervisor = hypervisor;
            Id = id;
            InferenceAccelerators = inferenceAccelerators;
            InstanceDisks = instanceDisks;
            InstanceStorageSupported = instanceStorageSupported;
            InstanceType = instanceType;
            Ipv6Supported = ipv6Supported;
            MaximumIpv4AddressesPerInterface = maximumIpv4AddressesPerInterface;
            MaximumIpv6AddressesPerInterface = maximumIpv6AddressesPerInterface;
            MaximumNetworkCards = maximumNetworkCards;
            MaximumNetworkInterfaces = maximumNetworkInterfaces;
            MemorySize = memorySize;
            NetworkPerformance = networkPerformance;
            SupportedArchitectures = supportedArchitectures;
            SupportedPlacementStrategies = supportedPlacementStrategies;
            SupportedRootDeviceTypes = supportedRootDeviceTypes;
            SupportedUsagesClasses = supportedUsagesClasses;
            SupportedVirtualizationTypes = supportedVirtualizationTypes;
            SustainedClockSpeed = sustainedClockSpeed;
            TotalFpgaMemory = totalFpgaMemory;
            TotalGpuMemory = totalGpuMemory;
            TotalInstanceStorage = totalInstanceStorage;
            ValidCores = validCores;
            ValidThreadsPerCores = validThreadsPerCores;
        }
    }
}

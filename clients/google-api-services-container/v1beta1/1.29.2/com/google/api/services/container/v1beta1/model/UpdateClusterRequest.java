/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.container.v1beta1.model;

/**
 * UpdateClusterRequest updates the settings of a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateClusterRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Deprecated. The name of the cluster to upgrade. This field has been deprecated and
   * replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * The name (project, location, cluster) of the cluster to update. Specified in the format
   * 'projects/locations/clusters'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. A description of the update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterUpdate update;

  /**
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster resides. This field has been
   * deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Required. Deprecated. The name of the cluster to upgrade. This field has been deprecated and
   * replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Required. Deprecated. The name of the cluster to upgrade. This field has been deprecated and
   * replaced by the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public UpdateClusterRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The name (project, location, cluster) of the cluster to update. Specified in the format
   * 'projects/locations/clusters'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster) of the cluster to update. Specified in the format
   * 'projects/locations/clusters'.
   * @param name name or {@code null} for none
   */
  public UpdateClusterRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public UpdateClusterRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Required. A description of the update.
   * @return value or {@code null} for none
   */
  public ClusterUpdate getUpdate() {
    return update;
  }

  /**
   * Required. A description of the update.
   * @param update update or {@code null} for none
   */
  public UpdateClusterRequest setUpdate(ClusterUpdate update) {
    this.update = update;
    return this;
  }

  /**
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster resides. This field has been
   * deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster resides. This field has been
   * deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public UpdateClusterRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public UpdateClusterRequest set(String fieldName, Object value) {
    return (UpdateClusterRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateClusterRequest clone() {
    return (UpdateClusterRequest) super.clone();
  }

}
